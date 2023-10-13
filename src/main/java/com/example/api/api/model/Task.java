package com.example.api.api.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class Task {
    private String userID;
    private String userPW;
    private String userNickName;
    private String userEmail;
    private String userDate;

    @Builder
    public Task(String userID, String userPW, String userNickName, String userEmail, String userDate) {
        this.userID = userID;
        this.userPW = userPW;
        this.userNickName = userNickName;
        this.userEmail = userEmail;
        this.userDate = userDate;
    }
}
