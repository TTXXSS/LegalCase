package com.tw.apistackbase.controller;

import com.tw.apistackbase.mode.Procurator;
import com.tw.apistackbase.service.ProcuratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/procurator")
public class ProcuratorController {
    @Autowired
    private ProcuratorService procuratorService;

    @GetMapping("/{id}")
    public Procurator getProcuratorById(@PathVariable long id){
        return procuratorService.getProcuratorById(id);
    }
}
