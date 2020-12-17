package com.luo.restfulcurd.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo Fuqiang
 * @date 2020/12/16 16:42
 */
@Api("HelloWorld")
@RestController
public class HelloWorldController {

    @ApiOperation(value = "HelloWorld")
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
