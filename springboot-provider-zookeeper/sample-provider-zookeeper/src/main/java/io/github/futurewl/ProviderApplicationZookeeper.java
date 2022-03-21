package io.github.futurewl;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan
@SpringBootApplication
public class ProviderApplicationZookeeper {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationZookeeper.class, args);
    }
}
