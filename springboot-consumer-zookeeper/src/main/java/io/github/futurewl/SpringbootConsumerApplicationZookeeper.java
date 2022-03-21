package io.github.futurewl;

import io.github.futurewl.service.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootConsumerApplicationZookeeper {

    @Reference
    IHelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConsumerApplicationZookeeper.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> System.out.println(helloService.sayHello("Mic"));
    }
}
