package com.wsdll.sleep;

import org.junit.Test;

/**
 * @description:
 * @author: WH
 * @create: 2018-12-03 14:24
 **/
public class Demo {

    @Test
    public void method() throws InterruptedException {
        System.out.println("yes");
        Thread.sleep(10000);
        System.out.println("end");
    }
}
