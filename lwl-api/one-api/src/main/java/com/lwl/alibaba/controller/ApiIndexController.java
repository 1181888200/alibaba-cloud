package com.lwl.alibaba.controller;

import com.lwl.alibaba.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiIndexController {

    @Autowired
    private IndexService indexService;


    @RequestMapping("/index")
    public String index(){
        return indexService.index();
    }

    @RequestMapping("/{param}")
    public String param(@PathVariable String param){
        return indexService.param(param);
    }

}
