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
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long certificateId;
    @NonNull
    private String name;
    @ManyToOne
    @JoinColumn(name = "skill_id")
    @NonNull
    private Skill skill;
    @ManyToOne
    @JoinColumn(name = "company_id")
    @NonNull
    private Company company;

}