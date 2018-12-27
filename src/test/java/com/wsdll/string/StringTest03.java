package com.wsdll.string;

import org.junit.Test;

/**
 * @description:
 * @author: WH
 * @create: 2018-12-13 16:33
 **/
public class StringTest03 {

    String str;

    String str2 = new String();

    @Test
    public void method() {
        System.out.println("str[" + this.str + "]");
        System.out.println("str2[" + this.str2 + "]");
        StringTest03 stringTest03 = new StringTest03();
        System.out.println("strTest03.str:[" + stringTest03.str + "]");
        System.out.println("strTest03.str2:[" + stringTest03.str2 + "]");
    }
}
