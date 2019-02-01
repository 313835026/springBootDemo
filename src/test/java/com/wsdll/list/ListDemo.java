package com.wsdll.list;

import com.wsdll.list.pojo.entity.Student;
import org.junit.Test;

import java.util.*;

/**
 * @description:
 * @author: WH
 * @create: 2018-12-13 13:45
 **/
public class ListDemo {

    //region List.toString方法
    @Test
    public void method() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.toString());
    }
    //endregion

    //region List Collections.sort 数字排序
    @Test
    public void method2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }
    //endregion

    //region ArrayList 自定义对象排序
    @Test
    public void method3() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Tom", 15));
        list.add(new Student("Andy", 25));
        list.add(new Student("Tom", 18));
        list.add(new Student("Lili", 15));
        list.add(new Student("Andy", 23));

        System.out.println(list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int age = o1.getAge() - o2.getAge();
                int name = age == 0 ? o1.getName().compareTo(o2.getName()) : age;
                return name;
            }
        });

        System.out.println(list);
    }
    //endregion

}
