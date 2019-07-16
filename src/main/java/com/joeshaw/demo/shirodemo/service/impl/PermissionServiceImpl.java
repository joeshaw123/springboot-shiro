package com.joeshaw.demo.shirodemo.service.impl;

import com.joeshaw.demo.shirodemo.mapper.PermissionMapper;
import com.joeshaw.demo.shirodemo.pojo.Permission;
import com.joeshaw.demo.shirodemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionsByRoleId(int roleId) {
        return permissionMapper.queryPermissionByRoleId(roleId);
    }
}
