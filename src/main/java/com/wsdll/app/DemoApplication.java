package com.wsdll.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.wsdll.demo.controller") 扫描包
//@EnableAutoConfiguration() 注入spring容器

// @SpringBootApplication相当于上面两个注解了,但只能默认扫描同目录下的包
@ComponentScan("com.wsdll.controller")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
