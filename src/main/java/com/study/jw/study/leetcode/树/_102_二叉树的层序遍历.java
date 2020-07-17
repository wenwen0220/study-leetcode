package com.study.jw.study.leetcode.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jww on 20200717.
 * Describe
 */
public class _102_二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> r = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size=queue.size();

            List<Integer> integerList=new ArrayList<Integer>();
            for (int i = 0; i <size ; i++) {
                TreeNode node = queue.poll();
                Integer val = node.val;
                integerList.add(val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            r.add(integerList);
        }

        return r;

    }
}
