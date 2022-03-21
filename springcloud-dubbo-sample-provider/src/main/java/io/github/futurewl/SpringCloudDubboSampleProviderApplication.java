package io.github.futurewl;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@DubboComponentScan
@SpringBootApplication
public class SpringCloudDubboSampleProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleProviderApplication.class, args);
    }
}
