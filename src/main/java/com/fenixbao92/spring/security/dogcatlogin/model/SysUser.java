package com.fenixbao92.spring.security.dogcatlogin.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Create by fenixbao92 on 2019/4/18.
 */
@Getter
@Setter
public class SysUser{

    private Integer id;

    private String name;

    private String password;
}

