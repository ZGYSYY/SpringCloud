package com.zgy.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced //开启负载均衡功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //更换Ribbon默认的负载均衡算法
    @Bean
    public IRule myRule(){
//        return new RoundRobinRule(); //默认的轮询算法
//        return new RandomRule(); //随机算法
        return new RetryRule(); //尝试轮询算法
    }
}
