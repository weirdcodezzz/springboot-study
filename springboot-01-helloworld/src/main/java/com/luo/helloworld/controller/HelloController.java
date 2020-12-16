package com.luo.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo Fuqiang
 * @date 2020/12/15 17:24
 */
@RestController
public class HelloController {

    /**
     * 返回Hello World
     * @return
     */
    @GetMapping("/hello")
    public String printHelloWorld(){
        return "Hello World";
    }
}
