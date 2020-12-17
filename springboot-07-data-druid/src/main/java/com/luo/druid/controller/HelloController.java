package com.luo.druid.controller;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luo Fuqiang
 * @date 2020/12/17 11:49
 */
@RestController
public class HelloController {

    private JdbcTemplate jdbcTemplate;

    public HelloController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/get_list")
    public List<Map<String, Object>> maps(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        return maps;
    }
}
