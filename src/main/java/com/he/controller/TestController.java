package com.he.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Kris He
 * @date 2021/12/28 15:40
 **/

@RestController
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "ok";
    }
}
