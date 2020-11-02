package com.lwl.alibaba.controller;

import com.lwl.alibaba.service.ZipkinService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description： zipkin 入口
 * @author     ：lwl
 * @date       ：2020/10/30 13:45
 * @version:     1.0.0
 */
@RestController
@RequestMapping("/zipkin")
public class ZipkinController {


    @Resource
    private ZipkinService sentinelService;


    /**
     *  通过自定义实现类限流
     * result:
     * author: lwl
     * date: 2020/10/30 15:44
     */
    @RequestMapping("/zk/list")
    public Object zkList(){
        return sentinelService.list();
    }

    @RequestMapping("/zk/one")
    public String zkOne(String id){
        return sentinelService.findOne(id);
    }

}
