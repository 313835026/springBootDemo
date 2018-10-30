package com.wsdll.reflections.scanner;

import com.wsdll.reflections.clazz.ThisIsAClazz;
import org.junit.Test;
import org.reflections.Reflections;

import java.lang.reflect.Method;
import java.util.Set;

/**
 * @description:
 * @author: WH
 * @create: 2018-10-29 14:29
 **/
public class Scanner {
    @Test
    public void scan() {
        Reflections reflections = new Reflections("com.wsdll.reflections.clazz");
        Set<Class<? extends ThisIsAClazz>> classes = reflections.getSubTypesOf(ThisIsAClazz.class);
        System.out.println(classes);
    }
}
