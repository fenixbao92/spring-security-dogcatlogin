package com.fenixbao92.spring.security.dogcatlogin.service;

import com.fenixbao92.spring.security.dogcatlogin.dao.SysUserMapper;
import com.fenixbao92.spring.security.dogcatlogin.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserService {

    @Resource
    private SysUserMapper userMapper;

    public SysUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return userMapper.selectByName(name);
    }
}

