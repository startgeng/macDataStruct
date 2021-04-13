package com.kevin.datastruct.algorithm;

public class MyQueue {

    private int[] arrry;
    private int front;
    private int rear;

    public MyQueue(int capacity){
        this.arrry = new int[capacity];
    }

    /**
     * 入队
     * @param element 入队元素
     */
    public void enQueue(int element) throws Exception {
        if ((rear+1) % arrry.length == front){
            throw new Exception("队列已满");
        }
        arrry[rear] = element;
        rear = (rear + 1) % arrry.length;   
    }

    /**
     * 出队
     */
    public void deQueue() throws Exception {
        if (front == rear){
            throw new Exception("队列以空！！！");
        }
        int deQueueElement = arrry[front];

    }
}
