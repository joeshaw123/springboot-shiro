package com.joeshaw.demo.shirodemo.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.joeshaw.demo.shirodemo.pojo.Permission;
/**
*  @author joeshaw
*/
public interface PermissionBaseMapper {

    int insertPermission(Permission object);

    int updatePermission(Permission object);

    int update(Permission.UpdateBuilder object);

    List<Permission> queryPermission(Permission object);

    Permission queryPermissionLimit1(Permission object);

}