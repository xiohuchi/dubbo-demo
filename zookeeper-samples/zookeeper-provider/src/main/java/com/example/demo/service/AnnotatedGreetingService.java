package com.example.demo.service;

import com.example.demo.GreetingService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 杨滨
 * @date 2021年04月23日
 */
@DubboService(version = "${demo.service.version}")
@Slf4j
public class AnnotatedGreetingService implements GreetingService {
    @Override
    public String sayHello(String name) {
        log.info("greeting service received: " + name);
        return "hello, " + name;
    }
}
