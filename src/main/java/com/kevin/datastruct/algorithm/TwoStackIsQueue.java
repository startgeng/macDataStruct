package com.kevin.datastruct.algorithm;

import java.util.Stack;

/**
 * @author clg  使用两个栈做队列
 */
public class TwoStackIsQueue {

    public Stack<Integer> stackA = new Stack<>();
    public Stack<Integer> stackB = new Stack<>();

    public void enQueue(int element){
        stackA.push(element);
    }

    public Integer deQueue(){
        if (stackB.isEmpty()){
            if (stackA.isEmpty()){
                return null;
            }
            transfer();
        }
        return stackB.pop();
    }

    private void transfer() {
        while (!stackA.isEmpty()){
            stackB.push(stackA.pop());
        }
    }
}
