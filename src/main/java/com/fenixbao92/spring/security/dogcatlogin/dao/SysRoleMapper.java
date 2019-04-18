package com.fenixbao92.spring.security.dogcatlogin.dao;

import com.fenixbao92.spring.security.dogcatlogin.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysRoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectById(Integer id);
}

