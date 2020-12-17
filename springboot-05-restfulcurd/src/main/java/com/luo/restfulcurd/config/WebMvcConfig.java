package com.luo.restfulcurd.config;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 通过实现WebMvcConfigurer接口来扩展SpringMvc的功能
 * @author luo Fuqiang
 * @date 2020/12/16 21:44
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
