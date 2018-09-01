package com.wsdll.controller;

import com.wsdll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jdbcTemplate")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/createUser")
    public int createUser(String username, Integer age) {
        System.out.println(username);
        int result = userService.createUser(username, age);
        return result;
    }
}
