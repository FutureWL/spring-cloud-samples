package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述：Msa Weather Collection Eureka Feign Application
 *
 * @author weilai create by 2019-06-09:15:24
 * @version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class MsaWeatherCollectionEurekaFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaWeatherCollectionEurekaFeignApplication.class, args);
    }
}
