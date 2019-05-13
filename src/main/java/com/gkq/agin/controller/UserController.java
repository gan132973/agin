package com.gkq.agin.controller;

import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "selcetUser")
    public String getIndex(Model model){
        User user = userService.selectUserById(1);
        model.addAttribute("user", user);
        return "index";
    }
}