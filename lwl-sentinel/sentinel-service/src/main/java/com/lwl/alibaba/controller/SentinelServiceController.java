package com.lwl.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lwl.alibaba.handler.MyBlockHandlerClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ss")
public class SentinelServiceController {

    @GetMapping("/findOne")
    @SentinelResource(
            value = "sentinel-service",
            blockHandler = "blockHandlerFunc",
            fallback = "fallbackFunc",
            blockHandlerClass = MyBlockHandlerClass.class
    )
    public String findOne(String id){
        return "我是Sentinel-Service提供的:[GET findOne] " +id ;
    }

    @SentinelResource(
            value = "sentinel-service",
            blockHandler = "blockHandlerFunc",
            fallback = "fallbackFunc",
            blockHandlerClass = MyBlockHandlerClass.class
    )
    @GetMapping("/list")
    public List list(){
        return Arrays.asList("Sentinel-1","Sentinel-2","Sentinel-3");
    }


    @GetMapping("/findNoLimit")
    public String findNoLimit(String id){
        return "我是Sentinel-Service提供的:[GET findNoLimit] " +id ;
    }


}
