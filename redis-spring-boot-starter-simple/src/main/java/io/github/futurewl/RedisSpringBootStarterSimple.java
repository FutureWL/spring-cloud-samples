package io.github.futurewl;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisSpringBootStarterSimple implements CommandLineRunner {

    @Autowired
    RedissonClient redissonClient;

    public static void main(String[] args) {
        SpringApplication.run(RedisSpringBootStarterSimple.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(redissonClient.getKeys().count());
    }
}
