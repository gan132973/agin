package com.gkq.agin.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class User {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "phone")
    private String phone;

}