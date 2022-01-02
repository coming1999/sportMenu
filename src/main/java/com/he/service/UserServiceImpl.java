package com.he.service;

import com.he.mapper.UserMapper;
import com.he.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kris He
 * @date 2022/01/02 14:52
 **/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByMessage(String username, String password) {
        return userMapper.getUserByMessage(username,password);
    }
}
