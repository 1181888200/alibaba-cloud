package com.lwl.alibaba;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description： sentinel Api
 * @author     ：lwl
 * @date       ：2020/10/30 13:44
 * @version:     1.0.0
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class SentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class);
    }

}
