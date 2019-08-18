package com.tw.apistackbase.controller;

import com.tw.apistackbase.mode.Procuratorate;
import com.tw.apistackbase.service.ProcuratorateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/procuratorate")
public class ProcuratorateController {
    @Autowired
    private ProcuratorateService procuratorateService;

    @GetMapping("/{id}")
    public Procuratorate getProcuratorateById(@PathVariable long id){
        System.out.println(id);
        return procuratorateService.getProcuratorateById(id);
    }
}
