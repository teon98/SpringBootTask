package com.example.api.api;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.api.api.model.Task;
import com.example.api.api.service.MemberService;

@SpringBootTest
class ApiApplicationTests {

	@Autowired
	MemberService memberService;

	@Test
	void test1() {
		List<Task> memberList = memberService.getList();
		for (Task t : memberList) {
			System.out.println("member = " + t.toString());
		}
	}

}
