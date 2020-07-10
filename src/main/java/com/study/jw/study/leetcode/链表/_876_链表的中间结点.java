package com.study.jw.study.leetcode.链表;

/**
 * Created by jww on 20200709.
 * Describe
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/solution/
 */
public class _876_链表的中间结点 {
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        int i = 0;
        while (curr != null) {
            ++i;
            curr = curr.next;
        }
        curr = head;
        int j = i / 2;
        while (j-- > 0) {
            curr = curr.next;
        }
        return curr;
    }
}
