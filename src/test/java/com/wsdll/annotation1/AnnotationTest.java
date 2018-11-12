package com.wsdll.annotation1;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: WH
 * @create: 2018-10-29 14:06
 **/
public class AnnotationTest {

    @Test
    public void annotationTest() {
        Method[] methods = RequestMappingEx.class.getMethods();
        for(Method m : methods){
            String name = m.getName();
            System.out.println(name);

        }

    }
}
