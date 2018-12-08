package com.wsdll.bigdecimal;

import org.junit.Test;

import java.math.BigDecimal;

public class BigDeciamlDemo {

    BigDecimal bigDecimal1 = new BigDecimal("1561255");
    BigDecimal bigDecimal2 = new BigDecimal("1561251");
    BigDecimal bigDecimal3 = new BigDecimal("1000");

    @Test
    public void method() {
        System.out.println(bigDecimal1.divide(bigDecimal3, 2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bigDecimal1.divide(bigDecimal3, 2, BigDecimal.ROUND_HALF_DOWN));
        System.out.println(bigDecimal2.divide(bigDecimal3, 2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bigDecimal2.divide(bigDecimal3, 2, BigDecimal.ROUND_HALF_DOWN));
    }
}
