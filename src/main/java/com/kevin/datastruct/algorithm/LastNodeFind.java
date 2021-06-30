package com.kevin.datastruct.algorithm;

/**
 * @author chenligeng
 * 找到倒数第n个节点
 */
public class LastNodeFind {

    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null){
            return null;
        }
        ListNode prev = head;
        ListNode post = head;
        for (int i = 0; i < k; i++) {
            prev = prev.next;
        }
        while (prev != null){
            prev = prev.next;
            post = post.next;
        }
        return post;
    }
}
