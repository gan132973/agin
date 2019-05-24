package com.gkq.agin.service.serviceimpl;


import com.gkq.agin.mapper.UserMapper;
import com.gkq.agin.model.User;
import com.gkq.agin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUserById(Map<String, Object> params) {
        int id = 0;
        List<Map<String, Object>> list = (List<Map<String, Object>>) params.get("data");
        if (list.size() > 0) {
            for (Map<String, Object> data : list) {
                String ids = data.get("ids") == null ? "" : data.get("ids").toString();
                id = Integer.parseInt(ids);
            }
        }
        return userMapper.findById(id);
    }
}