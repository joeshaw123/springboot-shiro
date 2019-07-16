package com.joeshaw.demo.shirodemo.service.impl;

import com.joeshaw.demo.shirodemo.mapper.UserMapper;
import com.joeshaw.demo.shirodemo.mapper.base.UserBaseMapper;
import com.joeshaw.demo.shirodemo.pojo.User;
import com.joeshaw.demo.shirodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBaseMapper userBaseMapper;

    @Override
    public User getUserByUsername(String username) {
        User user = new User();
        user.setUsername(username);
        return userBaseMapper.queryUserLimit1(user);
    }
}
