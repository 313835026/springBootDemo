package com.wsdll.service;

import com.wsdll.dao.UserDao;
import com.wsdll.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    // 注入jdbc模板
    @Autowired
    private JdbcTemplate jdbcTemplate;
    // jpa的dao
    @Autowired
    private UserDao userDao;

    // 这个是直接用jdbcTemplate,因为练习就没有创建dao层
    public int createUser(String username, int age) {
        System.out.println("name:" + username + ",age:" + age);
        int result = jdbcTemplate.update("insert into tb_user(username, age) value(?,?)", username, age);
        return result;
    }

    // jpa查询一个User对象
    public User jpaFindUser(Integer id) {
        return userDao.findById(id);
    }

}
