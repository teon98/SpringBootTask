package com.example.api.api.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.api.api.model.Task;

@Repository
@Mapper
public interface MemberMapper {
    Task getMember(String memberID);

    List<Task> getList();

    int save(Task member);

    int update(Task member);

    int delete(String memberID);
}
