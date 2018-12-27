package com.wsdll.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList转数组的两种方法
 **/
public class ArraysDemo {

    public void method() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(8);


        // public Object[] toArray()
        Integer[] i = (Integer[])list.toArray();


        // public <T> T[] toArray(T[] a)
        Integer[] ii = list.toArray(new Integer[list.size()]);

        // public <T> T[] toArray(T[] a)
        // 这个和上一个是一样的，最终数组会将元素放倒iii里
        Integer[] iii = new Integer[list.size()];
        list.toArray(iii);


    }
}
