package com.wsdll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 所有方法以以json格式返回数据,类似@ResponseBody+@Controller
@RestController
public class Home {

    @RequestMapping("/home")
    public String home() {
        return "hello world!";
    }
}
