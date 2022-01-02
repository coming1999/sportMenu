package com.he.mapper;

import com.he.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Kris He
 * @date 2021/12/31 19:25
 **/
@Repository
public interface UserMapper {
    public User getUserByMessage(@Param("username") String username, @Param("password") String password);
}
