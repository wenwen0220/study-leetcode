package com.study.jw.study.leetcode.牛客;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jww on .
 * Describe
 * {1,2,3}
 * [[1,2,3],[2,1,3],[2,3,1]]
 */
public class _输出二叉树的前中后序遍历 {

    private int pre=0,mid=0,suf=0;
    /**
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    public int[][] threeOrders(TreeNode root) {
        // write code here

        int n=countN(root);
        int[][] all=new int[3][n];
        preFind(root,all);
        return all;
    }

    public int countN(TreeNode node){
        if(node==null) return 0;
        return 1+countN(node.left)+countN(node.right);
    }

    public void preFind(TreeNode node,int[][] re){

        re[0][pre++]=node.val;
        preFind(node.left,re);
        re[0][mid++]=node.val;
        preFind(node.right,re);
        re[0][suf++]=node.val;
    }



    private  class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }
}
