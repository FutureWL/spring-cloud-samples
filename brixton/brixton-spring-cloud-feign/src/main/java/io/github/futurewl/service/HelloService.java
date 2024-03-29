package io.github.futurewl.service;

import io.github.futurewl.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:16
 * @version 1.0
 */
@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
