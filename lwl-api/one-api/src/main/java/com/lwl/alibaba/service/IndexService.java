package com.lwl.alibaba.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description： feign调用远程
 * @author     ：lwl
 * @date       ：2020/10/28 17:16
 * @version:     1.0.0
 */
@FeignClient(name = "one-service", fallback = IndexServiceImpl.class)
public interface IndexService {

    @RequestMapping("/index")
    String index();

    @RequestMapping("/index/param")
    String param(@RequestParam("param") String param);
}
