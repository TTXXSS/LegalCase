package com.tw.apistackbase.controller;

import com.tw.apistackbase.mode.CaseInformation;
import com.tw.apistackbase.service.CaseInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caseinfirmation")
public class CaseInformationController {
    @Autowired
    private CaseInformationService caseInformationService;

    @GetMapping("/{id}")
    public CaseInformation getCaseInformationById(@PathVariable long id){
        return caseInformationService.getCaseInformationById(id);
    }
}
