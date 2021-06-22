package com.kevin.datastruct.thread.demo2;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author chenligeng
 */
public class FutureTaskDemo {

    @Test
    public void demo1() throws ExecutionException, InterruptedException {
        Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
                Runtime.getRuntime().availableProcessors(),0L, TimeUnit.SECONDS,new LinkedBlockingDeque<>());
        FutureTask task = new FutureTask(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return "我是子线程:"+Thread.currentThread().getName();
            }
        });
        executor.submit(task);
        //得到的结果
        String result = (String) task.get();
        System.out.println(result);
        executor.shutdown();
    }
}
