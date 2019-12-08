package com.service;

import com.domain.Menu;
import com.domain.User;

import java.util.List;

public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<Menu> selectAllMenuByUser(User user);

    User selectOneUser(User user);
}
