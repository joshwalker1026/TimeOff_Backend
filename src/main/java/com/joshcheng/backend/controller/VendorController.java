package com.joshcheng.backend.controller;

import com.joshcheng.backend.dao.ExamInfoRepository;
import com.joshcheng.backend.dao.VendorRepository;
import com.joshcheng.backend.model.ExamInfo;
import com.joshcheng.backend.model.Vendor;
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
public class VendorController {

    @Autowired
    private VendorRepository vendorRepository;

    @GetMapping("/vendors")
    public Collection<Vendor> vendors() {
        return vendorRepository.findAll();
    }

    @GetMapping("/vendor/{id}")
    public ResponseEntity<?> getVendor(@PathVariable long id) {
        Optional<Vendor> vendor = vendorRepository.findById(id);
        return vendor.map(response -> ResponseEntity.ok().body(vendor))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}