package com.gkq.agin.controller;

import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import com.gkq.agin.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    RedisUtil redisUtil;


    @RequestMapping(value = "selcetUserById")
    public List<User> findUserById(@RequestBody Map<String,Object> params){return userService.findUserById(params); }



    @RequestMapping(value = "getRedis",method = RequestMethod.POST)
    @ResponseBody
    public String getRedis(){
        redisUtil.set("20182018","甘克强");
        boolean resExpire = redisUtil.expire("20182018",60);//设置key过期时间
         String res = (String) redisUtil.get("20182018");
        return res;
    }

}