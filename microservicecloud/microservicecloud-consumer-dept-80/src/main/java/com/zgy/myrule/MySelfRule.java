package com.zgy.myrule;

//自定义Ribbon负载均衡算法的配置类，注意，该类不能放在启动类所在的包和子包下

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule rule(){
        return new CustomerRule();
    }
}
