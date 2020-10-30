package com.study.jw.study.leetcode.动态规划;

/**
 * Created by jww on 10.21.
 * Describe
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 */
public class 最长上升子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        int max=dp[0]=1;
        for(int i=1;i<nums.length;i++){
            dp[i]=1;
            for(int j=1;j<i;j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}
