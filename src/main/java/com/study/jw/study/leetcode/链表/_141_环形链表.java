package com.study.jw.study.leetcode.链表;

/**
 * Created by jww on 20200709.
 * Describe
 */

public class _141_环形链表 {
    //快慢指针
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
