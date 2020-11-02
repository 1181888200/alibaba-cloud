package com.lwl.alibaba.controller;

import com.lwl.alibaba.config.Config;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description： 配置文件
 * @author     ：lwl
 * @date       ：2020/10/28 15:46
 * @version:     1.0.0
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private Config config;

    @GetMapping("/name")
    public Object method(){
        String name = config.getName();
        String result = "从Nacos配置中心读取的名称：";
        result = result + (StringUtils.isNotBlank(name)?name:"[配置中心未配置]");
        return result;
    }

    @GetMapping("/password")
    public Object password(){
        String name = config.getPassword();
        String result = "从Nacos配置中心读取的密码：";
        result = result + (StringUtils.isNotBlank(name)?name:"[配置中心未配置]");
        return result;
    }
}
