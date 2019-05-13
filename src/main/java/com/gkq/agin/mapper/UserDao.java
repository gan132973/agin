package com.gkq.agin.mapper;

import com.gkq.agin.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User selectUserById(Integer userId);

}