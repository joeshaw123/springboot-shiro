package com.joeshaw.demo.shirodemo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.joeshaw.demo.shirodemo.pojo.Permission;
import com.joeshaw.demo.shirodemo.mapper.base.PermissionBaseMapper;
/**
*  @author joeshaw
*/
public interface PermissionMapper extends PermissionBaseMapper{
    List<Permission> queryPermissionByRoleId(int roleId);


}