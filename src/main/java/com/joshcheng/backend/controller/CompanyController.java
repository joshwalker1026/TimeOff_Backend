package com.joshcheng.backend.controller;

import com.joshcheng.backend.dao.CompanyRepository;
import com.joshcheng.backend.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping("/companies")
    public Collection<Company> companies() {
        return companyRepository.findAll();
    }

    @GetMapping("/company/{id}")
    public ResponseEntity<?> getCompany(@PathVariable Long id) {
        Optional<Company> company = companyRepository.findById(id);
        return company.map(response -> ResponseEntity.ok().body(company))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
