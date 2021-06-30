package com.kevin.datastruct.algorithm;

/**
 * @author chenligeng 反转链表
 */
public class ReverLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode prev = head;
        ListNode cur = null;

        while (prev.next != null){
            ListNode temp = prev.next;
            prev.next = cur;
            cur = prev;
            prev = temp;
        }
        return cur;
    }
}
