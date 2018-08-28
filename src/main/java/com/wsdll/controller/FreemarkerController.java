package com.wsdll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreemarkerController {

    @RequestMapping(value = "/indexFreemarker")
    public String indexFreemarker(Map<String, Object> map) {
        map.put("name", "我是WSDLL");
        map.put("age", 18);
        map.put("sex", 1);
        List<String> list = new ArrayList<String>();
        list.add("一");
        list.add("二");
        list.add("三");
        map.put("numList", list);
        return "indexFreemarker";
    }
}
