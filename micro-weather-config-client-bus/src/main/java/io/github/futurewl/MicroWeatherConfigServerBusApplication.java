package io.github.futurewl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class MicroWeatherConfigServerBusApplication {

    @Value("${auther}")
    private String auther;

    @GetMapping("/hello")
    public String hello() {
        return "auther:" + auther;
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherConfigServerBusApplication.class, args);
    }
}
