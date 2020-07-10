package com.study.jw.study.leetcode.链表;

import com.sun.tools.classfile.Opcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jww on 20200709.
 * Describe
 */
public class _83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set=new HashSet();
        ListNode l=new ListNode(0);
        l.next=head;
        ListNode curr=head;
        ListNode pre=l;

        while(curr!=null){
            if(set.contains(curr.val)){
                //删除
                pre.next=curr.next;
            }else {
                pre=curr;
                set.add(curr.val);
            }
            curr=curr.next;
        }
        return l.next;

    }
}
