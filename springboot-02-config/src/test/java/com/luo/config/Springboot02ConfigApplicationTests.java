package com.luo.config;

import com.luo.config.pojo.Person;
import com.luo.config.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private HelloService helloService;
    @Test
    void contextLoads() {
        System.out.println(person);
    }


    @Test
    void helloServiceTest(){
        assert ("Hello World".equals(helloService.printHelloWorld()));
    }

}
