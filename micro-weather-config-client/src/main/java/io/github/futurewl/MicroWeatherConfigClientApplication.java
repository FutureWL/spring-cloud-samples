package io.github.futurewl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能描述：Micro Weather Config Client Application
 *
 * @author weilai create by 2019-06-09:23:12
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MicroWeatherConfigClientApplication implements CommandLineRunner {

    @Value("${auther}")
    private String auther;

    public static void main(String[] args) {
        SpringApplication.run(MicroWeatherConfigClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("auther:" + auther);
    }
}
