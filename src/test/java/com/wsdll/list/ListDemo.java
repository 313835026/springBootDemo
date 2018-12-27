package com.wsdll.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: WH
 * @create: 2018-12-13 13:45
 **/
public class ListDemo {

    @Test
    public void method() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.toString());
    }

}
