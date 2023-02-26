package com.sda.company.controller;

import com.sda.company.dto.CompanyCrateDTO;
import com.sda.company.dto.CompanyInfoDTO;
import com.sda.company.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {
    private final CompanyService companyService;
    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/create")//nu e neaparat /create dar e util
    public ResponseEntity<CompanyInfoDTO> createCompany(@RequestBody @Valid CompanyCrateDTO companyCrateDTO){
       CompanyInfoDTO companyInfoDTO= companyService.createCompany(companyCrateDTO);

        return ResponseEntity.ok(companyInfoDTO);
    }
}
