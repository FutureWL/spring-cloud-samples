package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:18:51
 * @version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FinchleyWeatherApplicationMsaWeatherReportEurekaFeignGateway {
    public static void main(String[] args) {
        SpringApplication.run(FinchleyWeatherApplicationMsaWeatherReportEurekaFeignGateway.class, args);
    }
}
