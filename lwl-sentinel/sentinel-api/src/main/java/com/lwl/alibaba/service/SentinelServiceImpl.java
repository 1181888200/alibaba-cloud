package com.lwl.alibaba.service;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class SentinelServiceImpl implements SentinelService {

    @Override
    public List list() {
        return Arrays.asList("被限流了，通过指定fallback的实现类");
    }

    @Override
    public String findOne(String id) {
        return "不限流执行操作";
    }
}
