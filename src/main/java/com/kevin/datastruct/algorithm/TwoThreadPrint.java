package com.kevin.datastruct.algorithm;

/**
 * @author chenligeng
 * 两个线程交替打印
 */
public class TwoThreadPrint {

    public static int number = 0;
    public static final Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(new ToolClass(),"偶数").start();
        Thread.sleep(10);
        new Thread(new ToolClass(),"奇数").start();
    }

    static class ToolClass implements Runnable {

        @Override
        public void run() {
            while (number <= 100){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName()+":"+number++);
                    object.notify();
                    try {
                        object.wait();
                    }catch (Exception e){
                        System.out.println(e.toString());
                    }
                }
            }
        }
    }

}

