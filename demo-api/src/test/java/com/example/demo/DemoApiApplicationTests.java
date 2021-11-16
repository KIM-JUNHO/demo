package com.example.demo;

import com.example.demo.common.model.Member;
import com.example.demo.common.service.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootApplication
@SpringBootTest
public class DemoApiApplicationTests {

    @Autowired
    private MemberService memberService;

    @Test
    public void save() {
        Member member = new Member("test", "test@test.com");
        Long id = memberService.signup(member);
        Assertions.assertEquals(1, id);
    }
}
