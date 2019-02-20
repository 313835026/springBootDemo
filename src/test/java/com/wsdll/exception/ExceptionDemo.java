package com.wsdll.exception;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {

    //region throw
    @Test
    public void method1() {
        throw new RuntimeException();
    }
    //endregion

    //region try...catch...finally
    @Test
    public void method2() {
        String str = "2019-02-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        Date d = null;
        try {
            d = sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            System.out.println("我总会输出");
        }
        System.out.println(d);
    }
    //endregion

    //region return和finally的关系
    @Test
    public void method3() {
        // 输出的是30，请看下面方法注释的解释
        System.out.println(method4());
    }

    /**
     * 实际上会执行到finally，但return 30语句已经在catch生成了，
     * 所以即使后面的i = 40也没用。
     * 这个finally是在return语句生成完毕但还没执行的时候会运行。
     */
    private int method4() {
        int i = 10;
        try {
            i = 20;
            System.out.println(i / 0);
        } catch (ArithmeticException e) {
            i = 30;
            return i;
        } finally {
            i = 40;
        }
        return i;
    }
    //endregion

    @Test
    public void method5() throws Exception {
        throw new MyException();
    }
}
