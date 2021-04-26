package com.kevin.datastruct.thread.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author clg
 * 初体验多线程
 */
public class CountExample {

    private static int threadTotal = 1;
    private static int clientTotal = 5000;
    private static long count = 0;

    public static void main(String[] args) {
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
            });
        }
        exec.shutdown();
        System.out.println(count);
    }

    private static void add() {
        count++;
    }
}
