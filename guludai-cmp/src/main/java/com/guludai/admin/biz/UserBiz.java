package com.guludai.admin.biz;

import org.springframework.stereotype.Service;

import com.guludai.admin.common.biz.BaseBiz;
import com.guludai.admin.entity.User;
import com.guludai.admin.mapper.UserMapper;

 
@Service
public class UserBiz extends BaseBiz<UserMapper,User> {

    public void insertSelective(User entity) {
       /* String password = new BCryptPasswordEncoder(UserConstant.PW_ENCORDER_SALT).encode(entity.getPassword());*/
        entity.setPassword(entity.getPassword());
        super.insertSelective(entity);
    }

    public void updateById(User entity) {
       // String password = new BCryptPasswordEncoder(UserConstant.PW_ENCORDER_SALT).encode(entity.getPassword());
        entity.setPassword(entity.getPassword());
        super.updateById(entity);
    }
}
