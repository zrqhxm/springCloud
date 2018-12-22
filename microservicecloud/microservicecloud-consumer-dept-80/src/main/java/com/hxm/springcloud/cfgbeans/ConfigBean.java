package com.hxm.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud.cfgbeans
 * @date 2018/12/21
 */
@Configuration
public class ConfigBean {

    /**
     *服务调用的模板，提供多种边界访问远程Http服务的方法，是一种简单便捷的访问restful服务的模板类，
     * 是Spring提供的用于访问Rest服务的客户端模板类工具集
     */
    @Bean
    @LoadBalanced //默认的轮询算法负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     *  负载均衡算法
     */
    @Bean
    public IRule myRule(){
         return new RoundRobinRule(); //轮询算法
         // return new RandomRule(); //随机算法
    }
}
