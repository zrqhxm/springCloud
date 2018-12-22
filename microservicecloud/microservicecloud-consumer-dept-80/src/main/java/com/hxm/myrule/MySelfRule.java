package com.hxm.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该自定义的算法类的位置不能和主启动类同一个包或在其子包下，此处为和主启动类同级目录
 * @author zrq
 * @version 1.0
 * @discription com.hxm.myrule
 * @date 2018/12/21
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
