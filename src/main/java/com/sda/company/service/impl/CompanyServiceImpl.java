package com.sda.company.service.impl;

import com.sda.company.convertor.CompanyConvertor;
import com.sda.company.dto.CompanyCrateDTO;
import com.sda.company.dto.CompanyInfoDTO;
import com.sda.company.model.CompanyEntity;
import com.sda.company.repository.CompanyRepository;
import com.sda.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyInfoDTO createCompany(CompanyCrateDTO companyCrateDTO) {

        CompanyEntity companyEntity= CompanyConvertor.convertToCompanyEntity(companyCrateDTO);
        CompanyEntity response=companyRepository.save(companyEntity);
        CompanyInfoDTO companyInfoDTO=CompanyConvertor.convertToInfoDTO(response);

        return companyInfoDTO;
    }
}
