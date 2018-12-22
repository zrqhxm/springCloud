package com.hxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud
 * @date 2018/12/21
 */
@SpringBootApplication
@EnableEurekaClient //注册到eureka中
@EnableDiscoveryClient
public class DeptProvider8002_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8002_App.class,args);
    }
}
