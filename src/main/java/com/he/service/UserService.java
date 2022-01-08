package com.he.service;

import com.he.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kris He
 * @date 2022/01/02 14:50
 **/
@Service
public interface UserService {
    public User getUserByMessage(@Param("username")String username, @Param("password")String password);
    public List<User> getAllUsers(@Param("username")String username, @Param("pageStart") int pageStart, @Param("pageSize") int pageSize);
    public int getUserCounts(@Param("username")String username);
}
