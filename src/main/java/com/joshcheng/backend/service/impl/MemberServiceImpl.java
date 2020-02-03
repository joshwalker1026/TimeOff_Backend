package com.joshcheng.backend.service.impl;

import com.joshcheng.backend.dao.MemberRepository;
import com.joshcheng.backend.model.Member;
import com.joshcheng.backend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        member.setMid(UUID.randomUUID().toString().replaceAll("-", ""));
        member.setCreateTime(new Date());
        memberRepository.save(member);
        return member;
    }

}