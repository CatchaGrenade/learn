package com.kaung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class JDBCController {

    @Resource
    JdbcTemplate jdbcTemplate;

    @GetMapping("/userLs")
    public List<Map<String, Object>> dbInfo(){
        String sql = "select * from user";
        List<Map<String, Object>> ls = jdbcTemplate.queryForList(sql);
        return ls;
    }

    @GetMapping("/addUser")
    public void addUser(){
        String sql = "insert user(id, name, pwd) values(3, '2', '3')";
        jdbcTemplate.update(sql);
    }

    @GetMapping("/addUser_normal")
    public void addUser_normal(){
        String sql = "insert user(id, name, pwd) values(?, ?, ?)";
        jdbcTemplate.update(sql, new Object[]{4, "wse", "23w1"});
    }

}
