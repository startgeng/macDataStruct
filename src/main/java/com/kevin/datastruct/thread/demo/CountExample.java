package com.kevin.datastruct.thread.demo;



import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author clg
 * 初体验多线程
 */
public class CountExample {
    private static int threadTotal = 200;
    private static int clientTotal = 5000;
    final private static CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
    private static long count = 0;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        for (int i = 0; i < clientTotal; i++) {
            exec.execute(()->{
                try{
                    semaphore.acquire();
                    add();
                    semaphore.release();
                }catch (Exception e){
                    throw new IllegalArgumentException("出现问题了");
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        exec.shutdown();
        System.out.println(count);
    }

    private static void add() {
        count++;
    }
}
