package com.wsdll.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 注入jdbc模板
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createUser(String username, int age) {
        System.out.println("name:" + username + ",age:" + age);
        int result = jdbcTemplate.update("insert into tb_user(username, age) value(?,?)", username, age);
        return result;
    }
}
