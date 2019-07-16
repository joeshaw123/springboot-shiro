package com.joeshaw.demo.shirodemo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.joeshaw.demo.shirodemo.pojo.Role;
import com.joeshaw.demo.shirodemo.mapper.base.RoleBaseMapper;
/**
*  @author joeshaw
*/
public interface RoleMapper extends RoleBaseMapper{
    List<Role> queryRolesByUserId(int userId);

}