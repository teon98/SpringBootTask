package com.example.api.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.api.api.model.Task;
import com.example.api.api.repository.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    //조회
    public List<Task> getList() {
        return memberMapper.getList();
    }

    //단건 조회
    public Task getMember(String memberID) {
        return memberMapper.getMember(memberID);
    }
    
    //저장
    public int save(Task member) {
        Task isexist = memberMapper.getMember(member.getUserID());
        //1건 가지고 오는 조건
        //참일때: ERROR(이미 회원가입 되어있는 사람)
        //거짓일때: TRUE(회원가입 가능)
        if (isexist != null) {
            return 0;
        }
        return memberMapper.save(member);
    }

    //업데이트
    public int update(Task member) {
        return memberMapper.update(member);
    }

    //삭제
    public int delete(String memberID) {
        return memberMapper.delete(memberID);
    }

}
