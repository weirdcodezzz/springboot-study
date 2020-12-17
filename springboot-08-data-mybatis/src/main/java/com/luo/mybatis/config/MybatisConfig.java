package com.luo.mybatis.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 自定义mybatis的配置规则
 * @author luo Fuqiang
 * @date 2020/12/17 15:20
 */
@MapperScan(value = "com.luo.mybatis.mapper")
@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return (c) -> {
            // 设置驼峰命名
            c.setMapUnderscoreToCamelCase(true);
        };
    }
}
