package com.he.controller;

import com.he.pojo.User;
import com.he.service.UserService;
import com.he.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kris He
 * @date 2022/01/02 14:17
 **/
@RestController
public class LoginController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        User us = userService.getUserByMessage(user.getUsername(), user.getPassword());
        System.out.println(us);
        return "ok";
    }
}
