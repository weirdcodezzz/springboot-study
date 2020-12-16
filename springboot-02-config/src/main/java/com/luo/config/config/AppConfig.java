package com.luo.config.config;

import com.luo.config.service.HelloService;
import com.luo.config.service.impl.HelloServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注解@Configuration指明当前类是一个配置类，就是来代替之前的spring配置文件
 * @author luo Fuqiang
 * @date 2020/12/16 9:04
 */
@Configuration
public class AppConfig {

    /**
     * 将方法的返回值添加到容器中
     * 容器中这个组件默认的id就是方法名
     * @return
     */
    @Bean
    public HelloService helloService(){
        return new HelloServiceImpl();
    }
}
