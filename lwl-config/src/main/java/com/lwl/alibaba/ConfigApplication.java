package com.lwl.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @description： 仅仅是为了演示nacos作为配置中心管理的功能
 * @author     ：lwl
 * @date       ：2020/10/28 15:45
 * @version:     1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class);
    }

}
