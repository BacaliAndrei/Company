package com.sda.company.controller;

import com.sda.company.dto.CompanyCrateDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {

    @PostMapping("/create")//nu e neaparat /create dar e util
    public ResponseEntity createCompany(@RequestBody @Valid CompanyCrateDTO companyCrateDTO){


        return ResponseEntity.ok(null);
    }
}
