package com.lwl.alibaba.controller;

import com.lwl.alibaba.service.SentinelApiService;
import com.lwl.alibaba.service.SentinelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description： sentinel 入口
 * @author     ：lwl
 * @date       ：2020/10/30 13:45
 * @version:     1.0.0
 */
@RestController
@RequestMapping("/sentinel")
public class SentinelController {

    @Resource
    private SentinelApiService sentinelApiService;

    @Resource
    private SentinelService sentinelService;

    /**
     *  通过异常限流
     * result:
     * author: lwl
     * date: 2020/10/30 15:44
     */
    @RequestMapping("/ep/list")
    public Object apiList(){
        return sentinelApiService.list();
    }

    @RequestMapping("/ep/one")
    public Object apiOne(String id){
        return sentinelApiService.findOne(id);
    }


    @RequestMapping("/ep/noLimit")
    public Object findNoLimit(String id){
        return sentinelApiService.findNoLimit(id);
    }


    /**
     *  通过自定义实现类限流
     * result:
     * author: lwl
     * date: 2020/10/30 15:44
     */
    @RequestMapping("/ss/list")
    public Object ssList(){
        return sentinelService.list();
    }

    @RequestMapping("/ss/one")
    public String ssOne(String id){
        return sentinelService.findOne(id);
    }

}
