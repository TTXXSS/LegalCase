package com.tw.apistackbase.service;

import com.tw.apistackbase.mode.LegalCase;
import com.tw.apistackbase.repository.LegalCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LegalCaseService {
    @Autowired
    private LegalCaseRepository legalCaseRepository;

    public LegalCase getLegalCaseById(long id){
        Optional<LegalCase> legalCaseOptional = legalCaseRepository.findById(id);
        if (legalCaseOptional.isPresent())
            return legalCaseOptional.get();
        return null;
    }

    public List<LegalCase> getAllLegalCases(){
        return legalCaseRepository.findAll();
    }

    public LegalCase addLegalCase(LegalCase legalCase){
        return legalCaseRepository.save(legalCase);
    }

    public LegalCase updateLegalCase(LegalCase legalCase){
        return legalCaseRepository.save(legalCase);
    }

    public List<LegalCase> findAllOrderByTime() {
        return legalCaseRepository.findAll(Sort.by(Sort.Order.desc("time")));
        //return legalCaseRepository.findAllOrderByTime();
    }

    public void deleteById(Long id) {
        legalCaseRepository.deleteById(id);
    }

    public List<LegalCase> getLegalCaseByName(String name) {
        return legalCaseRepository.findByName(name);
    }
}
