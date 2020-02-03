package com.joshcheng.backend.controller;

import com.joshcheng.backend.dao.CertificateRepository;
import com.joshcheng.backend.model.Certificate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class CertificateController {

    @Autowired
    private CertificateRepository certificateRepository;

    @GetMapping("/certificates")
    public Collection<Certificate> certificates(){
        return certificateRepository.findAll();
    }
}