package com.kevin.datastruct.algorithm;

import java.util.LinkedList;

/**
 * @author chenligeng
 * 两个链表的第一个相交元素
 */
public class LinkedListFirstNumber {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        while (curA != curB){
            curA =  curA != null ? curA.next : headB;
            curB = curB != null ? curB.next : curA;
        }
        return curA;
    }
}
