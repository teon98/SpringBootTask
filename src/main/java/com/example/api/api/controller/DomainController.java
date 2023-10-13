package com.example.api.api.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.api.model.Domain;
import com.example.api.api.service.DomainService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DomainController {
    
    private final DomainService domainService;

    @GetMapping(path="/domain")
    public List<String> allDomainList() {
        List<Domain> domain_list = domainService.geList();
        List<String> result = new ArrayList<>();

        for (Domain r : domain_list) {
            result.add(r.getName());
        }

        return result;
    }


}
