package com.joeshaw.demo.shirodemo.service.impl;

import com.joeshaw.demo.shirodemo.mapper.RoleMapper;
import com.joeshaw.demo.shirodemo.pojo.Role;
import com.joeshaw.demo.shirodemo.pojo.User;
import com.joeshaw.demo.shirodemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> getRolesByUser(User user) {
        return  roleMapper.queryRolesByUserId(user.getUId());
    }
}
