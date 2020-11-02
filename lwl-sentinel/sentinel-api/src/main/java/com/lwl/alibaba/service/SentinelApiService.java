package com.lwl.alibaba.service;

import com.lwl.alibaba.excepiton.SentinelApiServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description： 如果异常处理来获取限流后续操作
 * @author     ：lwl
 * @date       ：2020/10/30 14:00
 * @version:     1.0.0
 */
@FeignClient(name = "sentinel-service", fallbackFactory = SentinelApiServiceFallbackFactory.class)
public interface SentinelApiService {

    @RequestMapping("/ss/list")
    public List list();

    @RequestMapping("/ss/findOne")
    public String findOne(@RequestParam("id")String id);


    @RequestMapping("/ss/findNoLimit")
    public String findNoLimit(@RequestParam("id")String id);

}
