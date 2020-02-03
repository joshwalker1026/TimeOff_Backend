package com.joshcheng.backend.controller;

import com.joshcheng.backend.dao.ExamInfoRepository;
import com.joshcheng.backend.model.ExamInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class ExamController {

    @Autowired
    private ExamInfoRepository examInfoRepository;

    @GetMapping("/exams")
    public Collection<ExamInfo> exams() {
        return examInfoRepository.findAll();
    }

}