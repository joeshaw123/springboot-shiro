package com.joeshaw.demo.shirodemo.service.impl;

import com.joeshaw.demo.shirodemo.pojo.User;
import com.joeshaw.demo.shirodemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        User user = userService.getUserByUsername("张三");
        System.out.println(user);
    }


}