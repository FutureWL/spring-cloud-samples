package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述：Micro Weather Eureka Client Ribbon
 * 是一个负载均衡器
 *
 * @author weilai create by 2019-06-09:13:00
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class MicroWeatherEurekaClientRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherEurekaClientRibbonApplication.class, args);
    }
}
