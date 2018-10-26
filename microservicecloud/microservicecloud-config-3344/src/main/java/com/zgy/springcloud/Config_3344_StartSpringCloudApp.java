package com.zgy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启配置中心服务
public class Config_3344_StartSpringCloudApp {

    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
