package com.wsdll.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 所有方法以以json格式返回数据,类似@ResponseBody+@Controller
@RestController
public class ErrorController {

    /**
     * 通过除法来抛出异常
     *
     * @return
     */
    @RequestMapping(value = "errorDivision")
    public String errorDivision() {
        int i = 1 / 0;
        return "Error";
    }
}
