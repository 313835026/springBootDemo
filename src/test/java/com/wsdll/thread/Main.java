package com.wsdll.thread;

public class Main {

    StringBuffer sbuffer = new StringBuffer();
    StringBuilder sbuilder = new StringBuilder();

    public static void main(String[] args) {
        Main main = new Main();
        Thread1 t1 = main.new Thread1();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(main.sbuffer.toString());
        System.out.println("buffer长度" + main.sbuffer.length());
        System.out.println(main.sbuilder.toString());
        System.out.println("builder长度"+main.sbuilder.length());
    }

    class Thread1 implements Runnable{

        public void run(){
            for(int i=0; i<500; i++){
                sbuffer.append(""+i%10);
                //下面是同步块，加上同步块之后上面的StringBuffer输出和StringBuilder输出是一样的
//                synchronized (sbuilder) {
                sbuilder.append(""+i%10);
//                }
            }
        }
    }
}
