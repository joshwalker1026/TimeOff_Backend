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
@Table(name = "exam_info")
public class ExamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id", unique = true, nullable = false)
    private Long examId;
    @ManyToOne
    @JoinColumn(name = "certificate_id")
    @NonNull
    private Certificate certificate;
    @ManyToOne
    @JoinColumn(name = "vendor_id")
    @NonNull
    private Vendor vendor;
    @NonNull
    @Column(name = "exam_date")
    private Date examDate;
    @NonNull
    @Column(name = "publish_date")
    private Date publishDate;

}
