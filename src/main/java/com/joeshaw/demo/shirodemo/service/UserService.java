package com.joeshaw.demo.shirodemo.service;

import com.joeshaw.demo.shirodemo.pojo.User;

public interface UserService {
    /**
     * 根据用户名查询用户
     * @param username 用户名
     * @return User对象
     */
    User getUserByUsername(String username);

}
