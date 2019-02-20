package com.wsdll.exception;

public class MyException extends Exception{
    public MyException() {
        super("无参构造：你抛出了MyException");
    }

    public MyException(String message) {
        super(message);
    }
}
