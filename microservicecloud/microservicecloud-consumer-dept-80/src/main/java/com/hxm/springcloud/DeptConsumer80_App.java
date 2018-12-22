package com.hxm.springcloud;

import com.hxm.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud
 * @date 2018/12/21
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "microservicecloud-dept",configuration = MySelfRule.class) //给某个服务设置自定义的负载均衡算法
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
