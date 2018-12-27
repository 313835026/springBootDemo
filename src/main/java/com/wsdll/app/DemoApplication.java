package com.wsdll.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

//@ComponentScan("com.wsdll.demo.controller") 扫描包
//@EnableAutoConfiguration() 注入spring容器
// @SpringBootApplication相当于上面两个注解了,但只能默认扫描同目录下的包

@EnableScheduling // 支持定时任务
@ComponentScan(basePackages = {"com.wsdll.controller","com.wsdll.service","com.wsdll.dao","com.wsdll.entity","com.wsdll.lvmm"})
@ComponentScan("com.wsdll.errorutil")
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
