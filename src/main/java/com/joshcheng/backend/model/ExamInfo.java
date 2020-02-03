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
public class ExamInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Date examDate;
    @NonNull
    private Date publishDate;

}
