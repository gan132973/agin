package com.gkq.agin.service.serviceimpl;


import com.gkq.agin.mapper.UserMapper;
import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public User findUserById(int id) { return userMapper.findById(id); }

}

