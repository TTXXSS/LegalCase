package com.tw.apistackbase.service;

import com.tw.apistackbase.mode.Procurator;
import com.tw.apistackbase.repository.ProcuratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProcuratorService {
    @Autowired
    private ProcuratorRepository procuratorRepository;

    public Procurator getProcuratorById(long id){
        Optional<Procurator> optionalProcurator = procuratorRepository.findById(id);
        if(optionalProcurator.isPresent())
            return optionalProcurator.get();
        return null;
    }
}
