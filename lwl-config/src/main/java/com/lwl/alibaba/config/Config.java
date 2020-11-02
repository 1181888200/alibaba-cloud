package com.lwl.alibaba.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @description： 从nacos配置中心读取文件，RefreshScope 支持实时刷新
 * @author     ：lwl
 * @date       ：2020/10/28 15:55
 * @version:     1.0.0
 */
@Data
@RefreshScope
@Configuration
public class Config {

    @Value("${config.name}")
    private String name;

    @Value("${config.password:''}")
    private String password;
}
