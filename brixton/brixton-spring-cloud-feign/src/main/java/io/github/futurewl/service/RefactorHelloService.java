package io.github.futurewl.service;


import io.github.futurewl.service.didi.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService {
}
