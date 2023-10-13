package com.example.api.api.repository;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.api.api.model.Domain;


@Repository
@Mapper
public interface DomainMapper {
    List<Domain> getList();
}
