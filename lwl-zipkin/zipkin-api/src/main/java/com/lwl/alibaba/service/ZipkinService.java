package com.lwl.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "zipkin-service", fallback = ZipkinServiceImpl.class)
public interface ZipkinService {

    @RequestMapping("/zk/list")
    public List list();

    @RequestMapping("/zk/findOne")
    public String findOne(@RequestParam("id") String id);



}
