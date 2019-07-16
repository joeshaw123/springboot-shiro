package com.joeshaw.demo.shirodemo.service;

import com.joeshaw.demo.shirodemo.pojo.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> getPermissionsByRoleId(int roleId);
}
