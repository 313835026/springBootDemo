package com.wsdll.timestamp;

import org.junit.Test;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @description:
 * @author: WH
 * @create: 2018-11-29 13:09
 **/
public class Demo01 {

    @Test
    public void method() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(date);
        System.out.println(timestamp);
    }

}
