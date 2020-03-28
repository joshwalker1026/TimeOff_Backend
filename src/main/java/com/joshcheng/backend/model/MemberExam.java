package com.joshcheng.backend.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "member_exam")
public class MemberExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_exam_id", unique = true, nullable = false)
    private Long memberExamId;
    @ManyToOne
    @JoinColumn(name = "mid")
    @NonNull
    private Member member;
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private ExamInfo examInfo;
    @Column(name = "join_time")
    private Date joinTime;

}