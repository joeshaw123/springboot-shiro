package com.joeshaw.demo.shirodemo.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.joeshaw.demo.shirodemo.pojo.Role;
/**
*  @author joeshaw
*/
public interface RoleBaseMapper {

    int insertRole(Role object);

    int updateRole(Role object);

    int update(Role.UpdateBuilder object);

    List<Role> queryRole(Role object);

    Role queryRoleLimit1(Role object);

}