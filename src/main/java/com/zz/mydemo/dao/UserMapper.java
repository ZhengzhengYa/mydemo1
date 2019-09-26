package com.zz.mydemo.dao;

import com.zz.mydemo.model.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper {
    User findUserName(String username);
}