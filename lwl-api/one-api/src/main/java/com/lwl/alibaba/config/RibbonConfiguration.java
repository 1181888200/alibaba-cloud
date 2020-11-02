package com.lwl.alibaba.config;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description： 配置ribbon负载均衡方式
 * @author     ：lwl
 * @date       ：2020/10/28 18:00
 * @version:     1.0.0
 */
@Configuration
public class RibbonConfiguration {

    /**
     *  随机方式
     * result:
     * author: lwl
     * date: 2020/10/28 18:01
     */
    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }


    /**
     *  根据响应时间分配一个weight，响应时间越长，weight越小，被选中的可能性越低。
     *  实现原理：
     *      一个后台线程定期的从status里面读取评价响应时间，为每个server计算一个weight。
     *      Weight的计算也比较简单responsetime 减去每个server自己平均的responsetime是server的权重。
     *      当刚开始运行，没有形成status时，使用roubine策略选择server。
     * result:
     * author: lwl
     * date: 2020/10/28 18:22
     */
//    @Bean
//    public IRule ribbonRule(){
//        return new WeightedResponseTimeRule();
//    }


    /**
     * 复合判断server所在区域的性能和server的可用性选择server
     *  实现原理：
     *      使用ZoneAvoidancePredicate和AvailabilityPredicate来判断是否选择某个server，
     *      前一个判断判定一个zone的运行性能是否可用，剔除不可用的zone（的所有server），AvailabilityPredicate用于过滤掉连接数过多的Server。
     * result:
     * author: lwl
     * date: 2020/10/28 18:23
     */
//    @Bean
//    public IRule ribbonRule(){
//        return new ZoneAvoidanceRule();
//    }

    /**
     * 过滤掉那些因为一直连接失败的被标记为circuit tripped的后端server，并过滤掉那些高并发的的后端server（active connections 超过配置的阈值）
     *
     *  实现说明
     *      使用一个AvailabilityPredicate来包含过滤server的逻辑，其实就就是检查status里记录的各个server的运行状态
     * result:
     * author: lwl
     * date: 2020/10/28 18:25
     */
//    @Bean
//    public IRule ribbonRule(){
//        return new AvailabilityFilteringRule();
//    }


    // BestAvailableRule 选择一个最小的并发请求的server

    // RetryRule 对选定的负载均衡策略机上重试机制。	在一个配置时间段内当选择server不成功，则一直尝试使用subRule的方式选择一个可用的server

}
