package com.study.jw.study.leetcode.树;

import java.util.*;

/**
 * Created by jww on .
 * Describe
 */
public class _二叉树的层序遍历01 {

    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> re=new ArrayList<ArrayList<Integer>>();
        if(root==null){
            return re;
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        queue.offer(root);
        while(!queue.isEmpty()){

            ArrayList<Integer> integers = new ArrayList<Integer>();
            //这里一定要提前计算size，不然队列里弹出一个size就少了，有bug
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode x=queue.poll();
                integers.add(x.val);
                if(x.left!=null){
                    queue.offer(x.left);
                }
                if(x.right!=null){
                    queue.offer(x.right);
                }
            }

            re.add(integers);
        }

        return re;// write code here
    }
}
