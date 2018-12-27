package com.wsdll.async;

import org.junit.Test;

/**
 * @description:
 * @author: WH
 * @create: 2018-11-20 18:31
 **/
public class Async1 implements Runnable {

    StringBuilder stringBuilder;

    StringBuffer stringBuffer;

    @Test
    public void demo() {
        this.stringBuilder = new StringBuilder("stringBuilder");
        stringBuilder.append(333);

        this.stringBuffer = new StringBuffer("stringBuffer");
        stringBuffer.append(222);

        System.out.println(this.stringBuilder);
        System.out.println(this.stringBuffer);
        new Thread(new Async1()).start();
    }

//    public void run(StringBuilder stringBuilder, StringBuffer stringBuffer){
//        stringBuilder.append("+Builder");
//        stringBuffer.append("+Buffer");
//        System.out.println(stringBuilder);
//        System.out.println(stringBuffer);
//        System.out.println("start");
//
//    }

    @Override
    public void run() {
        System.out.println(this.stringBuilder);
        System.out.println(this.stringBuffer);
        System.out.println("start");
    }
}
