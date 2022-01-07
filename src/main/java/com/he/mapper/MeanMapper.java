package com.he.mapper;

import com.he.pojo.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeanMapper {
    public List<MainMenu> getMenus();
}
