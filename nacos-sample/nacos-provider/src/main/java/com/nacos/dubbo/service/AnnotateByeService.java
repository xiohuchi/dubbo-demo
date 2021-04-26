package com.nacos.dubbo.service;

import com.example.demo.ByeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 杨滨
 * @date 2021年04月26日
 */
@DubboService(version = "${demo.service.version}")
@Slf4j
public class AnnotateByeService implements ByeService {
    @Override
    public String sayBye(String name) {
        log.info("ByeService service received: " + name);
        return "Goodbye, " + name;
    }
}
