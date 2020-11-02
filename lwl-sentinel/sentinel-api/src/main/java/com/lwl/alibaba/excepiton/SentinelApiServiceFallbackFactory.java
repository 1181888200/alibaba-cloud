package com.lwl.alibaba.excepiton;

import com.lwl.alibaba.service.SentinelApiService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @description： 限流异常 后续操作
 * @author     ：lwl
 * @date       ：2020/10/30 14:38
 * @version:     1.0.0
 */
@Component
public class SentinelApiServiceFallbackFactory implements FallbackFactory<SentinelApiService> {
    @Override
    public SentinelApiService create(Throwable throwable) {
        return new SentinelApiService() {
            @Override
            public List list() {
                return Arrays.asList("请求被限流了，通过异常拦截的方式");
            }

            @Override
            public String findOne(String id) {
                return  ("Sentinel 限流 异常");
            }

            @Override
            public String findNoLimit(String id) {
                return  ("Sentinel  findNoLimit 限流 异常");
            }
        };
    }
}
