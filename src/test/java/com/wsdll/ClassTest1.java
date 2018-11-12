package com.wsdll;

/**
 * 测试<? extends A>
 * @author: WH
 * @create: 2018-10-20 10:56
 **/
public class ClassTest1 {
    public ClassTest1(){}

    public ClassTest1(Class<? extends A> classTest1) {}

    public void run() {
        ClassTest1 classTest1 = new ClassTest1(A.class);
        ClassTest1 classTest2 = new ClassTest1(B.class);
    }
}

class A {}

class B extends A{}
