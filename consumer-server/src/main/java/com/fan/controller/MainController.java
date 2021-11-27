package com.fan.controller;

import com.fan.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController
{
    @DubboReference
    private HelloService helloService;
    @GetMapping("/")
    public String index()
    {
        return helloService.sayHello("dubbo");
    }
}
