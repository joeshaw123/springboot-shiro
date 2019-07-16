package com.joeshaw.demo.shirodemo.config.shiro;

import com.joeshaw.demo.shirodemo.pojo.Permission;
import com.joeshaw.demo.shirodemo.pojo.Role;
import com.joeshaw.demo.shirodemo.pojo.User;
import com.joeshaw.demo.shirodemo.service.PermissionService;
import com.joeshaw.demo.shirodemo.service.RoleService;
import com.joeshaw.demo.shirodemo.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ShiroRealm extends AuthorizingRealm {
    private static final Logger LOGGER = LoggerFactory.getLogger(ShiroRealm.class);

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    /**
     * 用户添加权限
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录用户名
        User user = (User) principalCollection.getPrimaryPrincipal();
        LOGGER.info("进入shiro权限认证方法.....");
        LOGGER.info("user用户信息:"+user);
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        List<Role> roles = roleService.getRolesByUser(user);
        List<Permission> permissionList = new ArrayList<>();
        for (Role role : roles) {
            //添加角色
            simpleAuthorizationInfo.addRole(role.getRolename());
            List<Permission> permissions = permissionService.getPermissionsByRoleId(role.getRId());
            permissionList.addAll(permissions);
            for (Permission permission : permissions) {
                //添加权限
                simpleAuthorizationInfo.addStringPermission(permission.getUrl());
            }
        }
        LOGGER.info(String.format("用户%s拥有的角色有:%s,权限有%s",user.getUsername(),roles,permissionList));
        return simpleAuthorizationInfo;
    }

    /**
     * 用户登录认证
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        LOGGER.info("进入shiro登录认证方法....");
        if (authenticationToken == null) {
            LOGGER.info("token为空....");
            return null;
        }
        String username = authenticationToken.getPrincipal().toString();
        String credential = authenticationToken.getCredentials().toString();
        LOGGER.info("shiro中的token携带信息为:Principal="+username+",credentials="+credential);
        User user = userService.getUserByUsername(username);
        if (user != null) {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            LOGGER.info("user对象信息："+user);
            //加密的盐
            ByteSource source = ByteSource.Util.bytes(user.getKey());
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(),source, getName());
            return simpleAuthenticationInfo;
        }else{
            LOGGER.warn("未从数据库查询到相关用户...");
        }
        return null;
    }
}
