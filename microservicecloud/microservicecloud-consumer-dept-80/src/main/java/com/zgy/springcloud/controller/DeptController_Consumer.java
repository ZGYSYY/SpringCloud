package com.zgy.springcloud.controller;

import com.zgy.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    //房源域名
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
    //访问注册中心中注册的微服务Id
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @GetMapping("/consumer/dept/discover")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }
}
