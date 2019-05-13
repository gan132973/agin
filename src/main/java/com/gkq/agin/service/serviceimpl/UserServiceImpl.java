package com.gkq.agin.service.serviceimpl;


import com.gkq.agin.mapper.UserDao;
import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }

}

