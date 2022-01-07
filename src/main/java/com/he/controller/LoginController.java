package com.he.controller;

import com.he.pojo.User;
import com.he.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kris He
 * @date 2022/01/02 14:17
 **/
@RestController
public class LoginController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/login")
    public Map<String,Object> login(@RequestBody User user){
        String flag = "error";
        User us = userService.getUserByMessage(user.getUsername(), user.getPassword());
        HashMap<String, Object> res = new HashMap<>();
        if (us != null){
            flag = "ok";
        }
        res.put("flag",flag);
        res.put("user",user);
        return res;
    }
}
