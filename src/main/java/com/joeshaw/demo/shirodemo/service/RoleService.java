package com.joeshaw.demo.shirodemo.service;

import com.joeshaw.demo.shirodemo.pojo.Role;
import com.joeshaw.demo.shirodemo.pojo.User;

import java.util.List;

public interface RoleService {
    List<Role>  getRolesByUser(User user);
}
