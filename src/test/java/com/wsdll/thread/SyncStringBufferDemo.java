package com.wsdll.thread;

public class SyncStringBufferDemo {

    public static void main(String[] args) {
        SyncStringBuffer sync = new SyncStringBuffer();

        Thread thread1 = new Thread(sync, "thread1");
        thread1.start();

        Thread thread2 = new Thread(sync, "thread2");
        thread2.start();

        Thread thread3 = new Thread(sync, "thread3");
        thread3.start();

    }

}
