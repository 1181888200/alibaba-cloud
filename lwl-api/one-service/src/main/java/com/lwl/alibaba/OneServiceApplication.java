package com.lwl.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description： 提供给One-api 的服务
 * @author     ：lwl
 * @date       ：2020/10/28 16:57
 * @version:     1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OneServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneServiceApplication.class);
    }

}
