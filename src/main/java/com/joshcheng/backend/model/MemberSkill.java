package com.joshcheng.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "member_skill")
public class MemberSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_skill_id", unique = true, nullable = false)
    private Long memberSkillId;
    @ManyToOne
    @JoinColumn(name = "mid")
    @NonNull
    private Member member;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    @NonNull
    private Skill skill;

}
