package com.hxm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zrq
 * @version 1.0
 * @discription com.hxm.springcloud
 * @date 2018/12/21
 */
@SpringBootApplication
@EnableEurekaServer  //标注为Eureka的服务端
public class EurekaServer7002_App {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7002_App.class,args);
    }
}
