package com.wsdll.thread;

public class SyncStringBuffer implements Runnable {

    public static StringBuffer stringBuffer;

    @Override
    public void run() {
        stringBuffer = new StringBuffer();
        for (int i = 0 ; i < 500 ; i++) {
            stringBuffer.append(i%10);
            System.out.println(Thread.currentThread().getName() + ":" + stringBuffer.length());
        }
    }
}
