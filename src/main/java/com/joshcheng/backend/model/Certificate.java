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
@Table(name = "certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "certificate_id", unique = true, nullable = false)
    private Long certificateId;
    @NonNull
    @Column(name = "name", unique = true, nullable = false, length = 50)
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