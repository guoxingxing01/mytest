package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

    //查询所有
    List<User> findAll();
}
