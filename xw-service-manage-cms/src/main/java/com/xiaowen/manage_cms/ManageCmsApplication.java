package com.xiaowen.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients //开始feignClient
@EnableDiscoveryClient
@SpringBootApplication
@EntityScan("com.xiaowen.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages={"com.xiaowen.api"})//扫描接口
@ComponentScan(basePackages={"com.xiaowen.framework"})//扫描common包下的类
@ComponentScan(basePackages={"com.xiaowen.manage_cms"})//扫描本项目下的所有类
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
    }
}
