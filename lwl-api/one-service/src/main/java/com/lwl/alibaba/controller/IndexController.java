package com.lwl.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description： 请求入口
 * @author     ：lwl
 * @date       ：2020/10/28 17:00
 * @version:     1.0.0
 */
@RestController
@RequestMapping("/index")
public class IndexController {


    @GetMapping("")
    public String index(){
        return "我是OneServicet提供的:[GET]";
    }

    @GetMapping("/param")
    public String indexParam(String param){
        return "我是OneServicet提供的:[GET] 参数为："+ param;
    }

}
