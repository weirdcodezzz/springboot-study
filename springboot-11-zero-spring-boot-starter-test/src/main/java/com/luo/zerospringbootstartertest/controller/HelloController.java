package com.luo.zerospringbootstartertest.controller;

import com.luo.starter.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo Fuqiang
 * @date 2020/12/23 9:13
 */
@RestController
public class HelloController {

    HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello(){
        String result = helloService.sayHelloZero("fuqiang");
        return result;
    }
}
