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
public class MemberSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
