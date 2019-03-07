package com.wsdll.thread;

public class SellTicket implements Runnable {

    private static int tickets = 100;

    private Object object = new Object();

    @Override
    public void run() {
        while(true) {
            synchronized (object) {
                if(tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售出:" + (tickets--) + "张票");
                }
            }
        }
    }
}
