package com.tw.apistackbase.service;

import com.tw.apistackbase.mode.CaseInformation;
import com.tw.apistackbase.repository.CaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CaseInformationService {
    @Autowired
    private CaseInformationRepository caseInformationRepository;

    public CaseInformation getCaseInformationById(long id){
        Optional<CaseInformation> optionalCaseInformation = caseInformationRepository.findById(id);
        if (optionalCaseInformation.isPresent())
            return optionalCaseInformation.get();
        return null;
    }
}
