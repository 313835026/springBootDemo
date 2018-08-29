package com.wsdll.controller;

import com.wsdll.testentity.TestA;
import org.springframework.stereotype.Component;

@Component
public class GenericController {
    TestA a = new TestA("ABC");

    public void getClass1(TestA<?> testA) {

    }
}
