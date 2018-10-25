package com.zgy.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zgy.springcloud.entity.Dept;
import com.zgy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean add(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "processHystrix_Get") //一旦这个方法报错，就会调用指定的processHystrix_Get方法
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.findById(id);
        if(null == dept){
            throw new RuntimeException("该Id"+id+"没有对应的信息");
        }

        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.findAll();
    }

    //熔断后，调用的方法
    private Dept processHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该Id"+id+"没有对应的信息").setDb_source("no this database in Mysql");
    }
}
