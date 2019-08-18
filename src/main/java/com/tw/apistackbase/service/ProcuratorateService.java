package com.tw.apistackbase.service;

import com.tw.apistackbase.mode.Procuratorate;
import com.tw.apistackbase.repository.ProcuratorateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.OptionalInt;

@Service
public class ProcuratorateService {
    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    public Procuratorate getProcuratorateById(long id){
        Optional<Procuratorate> procuratorateOptional = procuratorateRepository.findById(id);
        if(procuratorateOptional.isPresent())
            return procuratorateOptional.get();
        return null;
    }
}
