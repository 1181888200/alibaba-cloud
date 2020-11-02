package com.lwl.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "sentinel-service", fallback = SentinelServiceImpl.class)
public interface SentinelService {

    @RequestMapping("/ss/list")
    public List list();

    @RequestMapping("/ss/findOne")
    public String findOne(@RequestParam("id")String id);



}
