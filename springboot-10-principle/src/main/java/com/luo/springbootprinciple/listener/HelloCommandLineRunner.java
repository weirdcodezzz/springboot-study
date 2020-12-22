package com.luo.springbootprinciple.listener;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author luo Fuqiang
 * @date 2020/12/22 16:38
 */
@Slf4j
@Component
public class HelloCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run.." + Arrays.asList(args));
    }
}
