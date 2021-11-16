package com.example.demo.controller;

import com.example.demo.common.model.Member;
import com.example.demo.common.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/")
    public Member get() {
        return new Member("test", "test@test.com");
    }

    @GetMapping("/signup")
    public Long signup() {
        return memberService.signup(new Member("test", "test@test.com"));
    }

    @GetMapping("/getMember")
    public List<Member> getMember() {
        return memberService.getMember();
    }
}
