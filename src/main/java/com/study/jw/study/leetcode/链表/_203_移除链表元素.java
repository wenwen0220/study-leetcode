package com.study.jw.study.leetcode.链表;

/**
 * Created by jww on 20200709.
 * Describe  伪头+双指针
 */
public class _203_移除链表元素 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode l = new ListNode(0);
        l.next = head;
        ListNode cur = head;
        ListNode pre = l;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return l.next;
    }
}
