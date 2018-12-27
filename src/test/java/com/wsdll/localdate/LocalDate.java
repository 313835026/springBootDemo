package com.wsdll.localdate;

import org.junit.Test;

import java.time.LocalDateTime;

/**
 * @description:
 * @author: WH
 * @create: 2018-11-29 13:41
 **/
public class LocalDate {

    @Test
    public void method() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        java.time.LocalDate localDate = java.time.LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018,12,02,13,22,35,3);
        System.out.println("设置的年-月-日 时-分-秒-纳秒:" + localDateTime1);
    }


}
