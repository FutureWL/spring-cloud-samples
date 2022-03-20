package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：Micro Weather Eureka Client
 *
 * @author weilai create by 2019-06-09:13:00
 * @version 1.0
 */
@RestController
@EnableEurekaClient
@SpringBootApplication
public class MicroWeatherEurekaClientApplication {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherEurekaClientApplication.class, args);
    }
}
