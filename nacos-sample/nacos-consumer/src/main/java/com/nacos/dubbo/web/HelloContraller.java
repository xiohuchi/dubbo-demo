package com.nacos.dubbo.web;

import com.example.demo.ByeService;
import com.example.demo.GreetingService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author 杨滨
 * @date 2021年04月23日
 */
@RestController
public class HelloContraller {
    @DubboReference(version = "${demo.service.version}")
    private GreetingService greetingService;
    @DubboReference(version = "${demo.service.version}")
    private ByeService byeService;

    @RequestMapping("/hello")
    public String hello() {
        return greetingService.sayHello("yangbin,now time is " + LocalDateTime.now().toString());
    }

    @RequestMapping("/bye")
    public String bye() {
        return byeService.sayBye("yangbin,now time is " + LocalDateTime.now().toString());
    }
}
