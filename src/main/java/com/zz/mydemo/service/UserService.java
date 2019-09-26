package com.zz.mydemo.service;

import com.zz.mydemo.dao.UserMapper;
import com.zz.mydemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findUserName(String username){
        return userMapper.findUserName(username);
    }

}
