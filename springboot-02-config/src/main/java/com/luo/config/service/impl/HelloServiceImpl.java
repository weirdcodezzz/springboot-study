package com.luo.config.service.impl;

import com.luo.config.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author luo Fuqiang
 * @date 2020/12/16 9:07
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String printHelloWorld() {
       return "Hello World";
    }
}
