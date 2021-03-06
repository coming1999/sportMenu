package com.he.controller;

import com.he.pojo.QueryInfo;
import com.he.pojo.User;
import com.he.service.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kris He
 * @date 2022/01/08 13:40
 **/
@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/alluser")
    public Map<String, Object> getUserList(QueryInfo queryInfo) {
        //获取最大列表数和当前页面编号
        int numbers = userService.getUserCounts("%" + queryInfo.getQuery() + "%");
        int pageStart = (queryInfo.getPageNum() - 1) * queryInfo.getPageSize();
        List<User> users = userService.getAllUsers("%" + queryInfo.getQuery() + "%", pageStart, queryInfo.getPageSize());
        HashMap<String, Object> res = new HashMap();
        res.put("numbers",numbers);
        res.put("data",users);
        return res;
    }
    @RequestMapping("/updateState")
    public String updateState(@Param("id") Integer id,@Param("state") Boolean state){
        int i = userService.updateState(id, state);
        return i > 0? "success":"error";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        user.setRole("普通用户");
        user.setState(false);
        int i = userService.addUser(user);
        return i > 0 ? "success" : "error";
    }
}
