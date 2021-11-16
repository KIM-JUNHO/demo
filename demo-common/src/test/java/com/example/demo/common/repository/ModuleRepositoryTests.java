package com.example.demo.common.repository;

import com.example.demo.common.model.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class ModuleRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void add() {
        memberRepository.save(new Member("test", "test@test.com"));
        Member member = memberRepository.findAll().get(0);
        Assertions.assertEquals("test",member.getName());

    }
}
