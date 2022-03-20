package io.github.futurewl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CityController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/cities")
    public String listCity() {
        return restTemplate.getForEntity(
                // 通过应用名称来查找
                "http://msa-weather-city-eureka/cities", String.class
        ).getBody();
    }

}
