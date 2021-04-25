package com.nacos.dubbo.web;

import com.example.demo.GreetingService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨滨
 * @date 2021年04月23日
 */
@RestController
public class HelloContraller {
    @DubboReference(version = "${demo.service.version}")
    private GreetingService greetingService;

    @RequestMapping("/hello")
    public String index() {
        return greetingService.sayHello("yangbin");
    }
}
