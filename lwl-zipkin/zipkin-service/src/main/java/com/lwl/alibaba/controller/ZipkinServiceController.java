package com.lwl.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.lwl.alibaba.handler.MyBlockHandlerClass;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/zk")
public class ZipkinServiceController {

    @GetMapping("/findOne")
    @SentinelResource(
            value = "zipkin-service",
            blockHandler = "blockHandlerFunc",
            fallback = "fallbackFunc",
            blockHandlerClass = MyBlockHandlerClass.class
    )
    public String findOne(String id){
        return "我是zipkin-Service提供的:[GET findOne] " +id ;
    }

    @SentinelResource(
            value = "zipkin-service",
            blockHandler = "blockHandlerFunc",
            fallback = "fallbackFunc",
            blockHandlerClass = MyBlockHandlerClass.class
    )
    @GetMapping("/list")
    public List list(){
        return Arrays.asList("zipkin-1","zipkin-2","zipkin-3");
    }


    @GetMapping("/findNoLimit")
    public String findNoLimit(String id){
        return "我是zipkin-Service提供的:[GET findNoLimit] " +id ;
    }


}
