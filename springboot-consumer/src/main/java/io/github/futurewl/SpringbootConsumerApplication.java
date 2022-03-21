package io.github.futurewl;

import io.github.futurewl.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootConsumerApplication {

    @Reference(url = "dubbo://192.168.0.12:20880/io.github.futurewl.service.IHelloService")
    IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(helloService.sayHello("Mic"));
    }
}
