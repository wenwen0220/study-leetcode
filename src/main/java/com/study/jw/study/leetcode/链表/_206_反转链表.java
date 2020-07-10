package com.study.jw.study.leetcode.链表;

/**
 * Created by jww on 20200707.
 * Describe
 */
public class _206_反转链表 {
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
