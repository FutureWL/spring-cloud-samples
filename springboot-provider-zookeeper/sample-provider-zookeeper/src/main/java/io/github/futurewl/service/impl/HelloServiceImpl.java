package io.github.futurewl.service.impl;

import io.github.futurewl.service.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class HelloServiceImpl implements IHelloService {

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s]:Hello,%s", serviceName, name);
    }

}
