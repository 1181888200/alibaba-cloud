package com.lwl.alibaba.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyBlockHandlerClass {

    // 处理限流
    public static String blockHandlerFunc(String a, BlockException e){
        log.warn("限流了",e);
        return "处理限流 blockHandlerFunc ";
    }
    // 处理降级
    public static String fallbackFunc(String a){
        log.warn("降级了");
        return " 降级了 fallbackFunc";
    }
}
