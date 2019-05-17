package com.gkq.agin.serviceTest;

import com.gkq.agin.baseTest.SpringTestCase;
import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceTest extends SpringTestCase {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;
    @Test
    public void selectUserByIdTest(){
        User user = userService.findUserById(2);
        logger.info("查找结果" + user);
    }

}