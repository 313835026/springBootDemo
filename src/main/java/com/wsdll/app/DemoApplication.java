package com.wsdll.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan("com.wsdll.demo.controller") 扫描包
//@EnableAutoConfiguration() 注入spring容器

// @SpringBootApplication相当于上面两个注解了
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
