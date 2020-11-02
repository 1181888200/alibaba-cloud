package com.lwl.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description： 测试Api调用
 * @author     ：lwl
 * @date       ：2020/10/28 16:49
 * @version:     1.0.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OneApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApiApplication.class);
    }

}
