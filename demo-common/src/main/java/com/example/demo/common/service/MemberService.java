package com.example.demo.common.service;

import com.example.demo.common.model.Member;
import com.example.demo.common.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signup(Member member) {
        return memberRepository.save(member).getId();
    }

    public List<Member> getMember() {
        return memberRepository.findAll();
    }
}