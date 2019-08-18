package com.tw.apistackbase.controller;

import com.tw.apistackbase.mode.LegalCase;
import com.tw.apistackbase.repository.LegalCaseRepository;
import com.tw.apistackbase.service.LegalCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/legalcase")
public class LegalCaseController {
    @Autowired
    private LegalCaseService legalCaseService;

    @GetMapping(produces = {"application/json"})
    public Iterable<LegalCase> list() {
        return legalCaseService.getAllLegalCases();
    }

    @PostMapping()
    public LegalCase addLegalCase(@RequestBody LegalCase legalCase) {
       return legalCaseService.addLegalCase(legalCase);
    }
    @PutMapping
    public LegalCase update(@RequestBody LegalCase legalCase){
        return legalCaseService.updateLegalCase(legalCase);
    }

    @GetMapping("/{id}")
    public LegalCase getCaseById(@PathVariable Long id){
        return legalCaseService.getLegalCaseById(id);
    }

    @GetMapping("/time/")
    public List<LegalCase> getAllByOrderByTime() {
      return legalCaseService.findAllOrderByTime();
    }

    @GetMapping(path ="/name/")
    public List<LegalCase> getLegalCasesByName(@RequestParam String name){
        return legalCaseService.getLegalCaseByName(name);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
         legalCaseService.deleteById(id);
    }

}
