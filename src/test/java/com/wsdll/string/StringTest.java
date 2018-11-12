package com.wsdll.string;

import org.junit.Test;

/**
 * @description:
 * @author: WH
 * @create: 2018-10-29 16:40
 **/
public class StringTest {

    @Test
    public void strTest() {
        String str = "{\"}";
        str = str.replace("\\\"", "\"");
        System.out.println(str);
    }

}

