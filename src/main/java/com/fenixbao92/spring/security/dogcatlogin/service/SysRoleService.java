package com.fenixbao92.spring.security.dogcatlogin.service;

import com.fenixbao92.spring.security.dogcatlogin.dao.SysRoleMapper;
import com.fenixbao92.spring.security.dogcatlogin.model.SysRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysRoleService {
    @Resource
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}

