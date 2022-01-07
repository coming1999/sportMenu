package com.he.service;

import com.he.mapper.MeanMapper;
import com.he.pojo.MainMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kris He
 * @date 2022/01/07 13:37
 **/
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MeanMapper meanMapper;

    @Override
    public List<MainMenu> getMenus() {
        return meanMapper.getMenus();
    }
}
