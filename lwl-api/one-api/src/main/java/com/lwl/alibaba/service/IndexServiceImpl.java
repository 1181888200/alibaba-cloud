package com.lwl.alibaba.service;

import org.springframework.stereotype.Component;

/**
 * @description： fengin调用失败 回调此方法
 * @author     ：lwl
 * @date       ：2020/10/28 17:17
 * @version:     1.0.0
 */
@Component
public class IndexServiceImpl implements IndexService {
    @Override
    public String index() {
        return "feign调用失败，请稍后再试";
    }

    @Override
    public String param(String param) {
        return "feign调用失败，请稍后再试: [ "+param+" ]";
    }
}
