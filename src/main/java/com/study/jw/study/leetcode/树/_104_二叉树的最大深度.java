package com.study.jw.study.leetcode.树;

/**
 * Created by jww on 20200717.
 * Describe
 */
public class _104_二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        if(root ==null ) return 0;
        int right=maxDepth(root.right);
        int left=maxDepth(root.left);
        return Math.max(right,left)+1;

    }
}
