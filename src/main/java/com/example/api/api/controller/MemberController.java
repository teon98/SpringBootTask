package com.example.api.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.api.model.Task;
import com.example.api.api.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController {
    
    private final MemberService memberService;

    @GetMapping(path="/member") 
    public List<Task> allMemberList() {
        return memberService.getList();
    }

    @GetMapping(path = "/member/{id}")
    public Task findMember(@PathVariable("id") String memberID) {
        return memberService.getMember(memberID);
    }

    @PostMapping(path="/member")
    public String saveNewMember(@RequestBody Task newMember) {
        int result = memberService.save(newMember);
        return (result == 0 ? "저장실패" : "저장완료");
    }

    @DeleteMapping(path="/member/{id}")
    public String deleteMember(@PathVariable("id") String memberID) {
        int result = memberService.delete(memberID);
        return (result < 1 ? "삭제실패" : "삭제완료");
    }

    @PutMapping(path="/member")
    public String modifyMember(@RequestBody Task newMember) {
        int result = memberService.update(newMember);
        return (result < 1 ? "수정실패" : "수정완료");

    }
    
    @DeleteMapping(path="/deleteAllmembers")
    public void deleteAllmembers() {
        memberService.deleteAllMembers();
    }
}
