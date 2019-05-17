package com.gkq.agin.controller;

import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "selcetUserById")
    public void findUserById(int id){userService.findUserById(id); }
}