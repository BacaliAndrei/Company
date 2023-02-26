package com.sda.company.convertor;

import com.sda.company.dto.CompanyCrateDTO;
import com.sda.company.dto.CompanyInfoDTO;
import com.sda.company.model.CompanyEntity;

public class CompanyConvertor {
    public static CompanyEntity convertToCompanyEntity(CompanyCrateDTO companyCrateDTO) {

        CompanyEntity company = new CompanyEntity();
        company.setName(companyCrateDTO.getName());
        company.setAddress(companyCrateDTO.getAddress());
        company.setEmail(companyCrateDTO.getEmail());
        company.setRegistrationNumber(companyCrateDTO.getRegistrationNumber());
        company.setPhoneNumber(companyCrateDTO.getPhoneNumber());

        return company;
    }
    public static CompanyInfoDTO convertToInfoDTO(CompanyEntity companyEntity){

        CompanyInfoDTO companyInfoDTO=new CompanyInfoDTO();
        companyInfoDTO.setId(companyEntity.getId());
        companyInfoDTO.setAddress(companyEntity.getAddress());
        companyInfoDTO.setEmail(companyEntity.getEmail());
        companyInfoDTO.setName(companyEntity.getName());
        companyInfoDTO.setPhoneNumber(companyEntity.getPhoneNumber());
        companyInfoDTO.setRegistrationNumber(companyEntity.getRegistrationNumber());

        return companyInfoDTO;
    }

}
