package com.fenixbao92.spring.security.dogcatlogin.model;

import java.io.Serializable;

/**
 * Create by fenixbao92 on 2019/4/18.
 */
public class SysUser implements Serializable {
    static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String password;

    // 省略getter/setter
}

