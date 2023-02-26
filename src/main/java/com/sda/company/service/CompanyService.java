package com.sda.company.service;

import com.sda.company.dto.CompanyCrateDTO;
import com.sda.company.dto.CompanyInfoDTO;

public interface CompanyService {
    public CompanyInfoDTO createCompany(CompanyCrateDTO companyCrateDTO);
}
