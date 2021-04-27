package com.kevin.datastruct.algorithm;

/**
 * @author clg
 * 循环队列
 */
public class MyQueue {

    private int[] array;
    private int front;
    private int rear;

    public MyQueue(int capacity){
        this.array = new int[capacity];
    }

    /**
     * 入队操作
     * 1.先判断队列是否已经是满的
     * 2.对队尾添加元素
     * 3.队尾的指针加1
     */
    public void enQueue(int element){
        if ((rear+1)%array.length == front){
            throw new IllegalArgumentException("队列已满!");
        }
        array[rear] = element;
        rear = (rear + 1) % array.length;
    }

    /**
     * 出队操作
     * 1.先判断队列是否为空
     * 2.对队首的元素进行移除
     * 3.队首指针加1
     * @return
     */
    public int deQueue(){
        if (rear == front){
            throw new IllegalArgumentException("队列为空!");
        }
        int deQueueElement = array[front];
        front = (front + 1) % array.length;
        return deQueueElement;
    }

    /**
     * 输出队列
     */
    public void output(){
        for (int i = front; i != rear ; i = (i+1)%array.length){
            System.out.println(array[i]);
        }
    }
}
