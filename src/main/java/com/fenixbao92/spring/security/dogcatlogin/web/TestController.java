package com.fenixbao92.spring.security.dogcatlogin.web;

import com.fenixbao92.spring.security.dogcatlogin.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value = "/test", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public String test() {
        SysUser sysUser = new SysUser();
        return "hello";
    }

}