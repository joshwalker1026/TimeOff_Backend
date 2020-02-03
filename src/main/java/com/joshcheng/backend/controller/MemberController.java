package com.joshcheng.backend.controller;

import com.joshcheng.backend.dao.MemberRepository;
import com.joshcheng.backend.model.Member;
import com.joshcheng.backend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public Collection<Member> members() {
        return memberRepository.findAll();
    }

    @GetMapping("/member/{id}")
    public ResponseEntity<?> getMember(@PathVariable Long id) {
        Optional<Member> member = memberRepository.findById(id);
        return member.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/member")
    public ResponseEntity<Member> createMember(@Valid @RequestBody Member member) throws Exception {
        Member result = memberService.saveMember(member);
        return ResponseEntity.ok().body(result);
    }

    @PutMapping("/member/{id}")
    public ResponseEntity<Member> updateMember(@Valid @RequestBody Member member) {
        Member result = memberRepository.save(member);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/member/{id}")
    public ResponseEntity<?> deleteMember(@PathVariable Long id){
        memberRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
