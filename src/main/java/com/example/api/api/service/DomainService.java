package com.example.api.api.service;

import org.springframework.stereotype.Service;

import com.example.api.api.model.Domain;
import com.example.api.api.repository.DomainMapper;

import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainService {
    private final DomainMapper domainMapper;

    //조회
    public List<Domain> geList() {
        return domainMapper.getList();
    }
}
