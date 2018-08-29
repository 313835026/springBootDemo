package com.wsdll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

// 所有方法以以json格式返回数据,类似@ResponseBody+@Controller
@RestController
@RequestMapping(value = "/home")
public class Home {

    @RequestMapping("/home")
    public String home(HttpServletRequest request) {
        System.out.println(request.getMethod());
        System.out.println("------------|" + request.getContextPath() + "|------------");
        return "hello world!!!";
    }
}
