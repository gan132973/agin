package com.gkq.agin.service;

import com.gkq.agin.model.User;

import java.util.List;
import java.util.Map;


public interface UserService {
    List<User> findUserById(Map<String, Object> id);
}
