package com.gkq.agin.mapper;

import com.gkq.agin.basemapper.BaseMapper;
import com.gkq.agin.model.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {
    @Select("select *from t_user where id =#{id}")
    User findById(int id);
}
