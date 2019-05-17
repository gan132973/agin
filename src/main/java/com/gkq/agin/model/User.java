package com.gkq.agin.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;

@Data
public class User {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Column(name = "phone")
    private String phone;

}