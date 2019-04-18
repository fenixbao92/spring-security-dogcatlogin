package com.fenixbao92.spring.security.dogcatlogin.service;

import com.fenixbao92.spring.security.dogcatlogin.dao.SysUserRoleMapper;
import com.fenixbao92.spring.security.dogcatlogin.model.SysUserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserRoleService {

    @Resource
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }

}

