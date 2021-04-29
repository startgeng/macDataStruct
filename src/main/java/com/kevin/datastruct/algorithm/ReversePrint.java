package com.kevin.datastruct.algorithm;

import java.util.Stack;

/**
 * 剑指offer06题
 * @author clg
 * 打印倒序链表
 */
public class ReversePrint {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] reversePrint(ListNode head) {
      //思路 先加入栈  然后在输出
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
