package com.fan.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

@DubboService(group = "www")
public class HelloServiceimpl implements HelloService{
    @Override
    public String sayHello(String name) {
        return "张三"+name;
    }
}
