package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 功能描述：Msa Weather Collection Eureka Application
 *
 * @author weilai create by 2019-06-09:13:47
 * @version 1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class MsaWeatherCollectionEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaWeatherCollectionEurekaApplication.class, args);
    }
}
