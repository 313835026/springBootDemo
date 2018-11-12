package com.wsdll.optional.temp1;

import org.junit.Test;

import java.util.Optional;

/**
 * @description:
 * @author: WH
 * @create: 2018-11-08 17:15
 **/
public class ForOptionalOne {

    @Test
    public void forOptional() {
        Optional<String> option = Optional.ofNullable("123");
        String str = option.get();
        System.out.println(str);
    }
}
