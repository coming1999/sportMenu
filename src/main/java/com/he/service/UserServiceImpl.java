package com.he.service;

import com.he.mapper.UserMapper;
import com.he.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<User> getAllUsers(String username, int pageStart, int pageSize) {
        return userMapper.getAllUsers(username,pageStart,pageSize);
    }

    @Override
    public int getUserCounts(String username) {
        return userMapper.getUserCounts(username);
    }

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public int updateState(Integer id, Boolean state) {
        return userMapper.updateState(id, state);
    }
}
