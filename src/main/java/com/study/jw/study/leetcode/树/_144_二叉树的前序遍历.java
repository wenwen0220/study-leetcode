package com.study.jw.study.leetcode.树;

import java.util.*;

/**
 * Created by jww on 20200716.
 * Describe
 */
public class _144_二叉树的前序遍历 {
    //递归方法
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<Integer> list = new ArrayList<Integer>();
        travelsal(root, list);
        return list;
    }

    private void travelsal(TreeNode node, List<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        travelsal(node.left, list);
        travelsal(node.right, list);
    }


    //栈
    public List<Integer> preorderTraversal01(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();

        if (root == null) return Collections.emptyList();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            list.add(stack.pop().val);
            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
        return list;
    }

}
