package com.joshcheng.backend;

import com.joshcheng.backend.dao.MemberRepository;
import com.joshcheng.backend.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {

//        Member member = new Member("michael@gmail.com", "abc12345", "michael", "jordan");
//        memberRepository.save(member);
//        member = new Member("Ian2@gmail.com", "2222222", "Ian", "Lo");
//        memberRepository.save(member);
    }

}
