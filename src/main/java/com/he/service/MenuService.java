package com.he.service;

import com.he.pojo.MainMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MenuService {
    public List<MainMenu> getMenus();
}
