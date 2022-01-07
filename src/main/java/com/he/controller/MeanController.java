package com.he.controller;

import com.he.pojo.MainMenu;
import com.he.service.MenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Kris He
 * @date 2022/01/07 13:39
 **/
@RestController
public class MeanController {

    @Autowired
    MenuServiceImpl menuService;

    @RequestMapping("/menus")
    public Map<String,Object> getAllMenus(){
        HashMap<String,Object> date = new HashMap();
        List<MainMenu> menus = menuService.getMenus();
        if (menus != null){
            date.put("menus",menus);
            date.put("flag",200);
        }else{
            date.put("flag",404);
        }
        return date;
    }
}
