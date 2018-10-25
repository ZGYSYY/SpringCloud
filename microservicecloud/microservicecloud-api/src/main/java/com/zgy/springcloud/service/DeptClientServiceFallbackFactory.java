package com.zgy.springcloud.service;

import com.zgy.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

//熔断的的服务降级处理，所谓的服务降级解决的问题就是当某个服务提供者不能被访问后，客户端会自动返回一个缺省值，
// 而不会在访问提供者的时候产生等待时间，造成请求阻塞，从而引起雪崩效应。
@Component //这个注解一定要加，否则会报错
public class DeptClientServiceFallbackFactory implements FallbackFactory{

    @Override
    public Object create(Throwable throwable) {
        //使用匿名内部类，在客户端进行服务降级，这样就能解决在访问服务提供者的时候，服务提供者关闭后，
        // 客户端直接返回缺省值，保证应用的可用性
        return new DeptClientService() {
            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该Id"+id+"没有对应的信息").setDb_source("no this database in Mysql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
