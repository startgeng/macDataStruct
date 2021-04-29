package com.kevin.datastruct.algorithm;

import java.util.Stack;
/**
 * @author clg 剑指offer06题 倒置输出链表
 */
public class ReversePrintListNode {

    public class ListNode{
        int val;
        ListNode next;

        ListNode(int x){
            val = x;
        }
    }

    /**
     * 倒置输出链表
     * @param head 链表
     * @return 返回一个有值的数组
     */
    public int[] reversePrint(ListNode head) {
        //思路
        //先把数据存储到 栈里面 在将数据 放到对应的 数组里面
        Stack<ListNode> stack = new Stack<>();
        ListNode pointer = head;
        while (pointer != null){
            stack.push(pointer);
            pointer = pointer.next;
        }
        int length = stack.size();
        int[] res = new int[length];
        for (int i = 0; i < length; i++) {
            res[i] = stack.pop().val;
        }
        return res;
    }
}
