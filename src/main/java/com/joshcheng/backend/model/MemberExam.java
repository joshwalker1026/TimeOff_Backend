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
public class MemberExam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberExamId;
    @ManyToOne
    @JoinColumn(name = "mid")
    @NonNull
    private Member member;
    @ManyToOne
    @JoinColumn(name = "exam_id")
    private ExamInfo examInfo;
    private Date joinTime;

}