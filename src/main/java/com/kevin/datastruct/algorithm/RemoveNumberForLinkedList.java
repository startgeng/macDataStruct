package com.kevin.datastruct.algorithm;

/**
 * @author chenligeng
 * 删除链表指定的的数据
 */
public class RemoveNumberForLinkedList {


    public ListNode deleteNode(ListNode head, int val) {
        if (head == null){
            return null;
        }
        if (head.val == val){
            return head.next;
        }
        ListNode post = head;
        ListNode pre = head.next;
        while (pre != null && pre.val != val){
            post = pre;
            pre = pre.next;
        }
        if (pre != null){
            post.next = pre.next;
        }
        return head;
    }
}

