package com.kevin.datastruct.algorithm;

import java.util.Stack;

/**
 * 两个栈实现队列
 */
public class TwoStackImplQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public TwoStackImplQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int val){
        stack1.push(val);
    }

    public int deleteHead(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()){
            return -1;
        }else {
            return stack2.pop();
        }
    }
}
