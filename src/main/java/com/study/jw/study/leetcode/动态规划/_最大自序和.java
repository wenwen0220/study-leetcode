package com.study.jw.study.leetcode.动态规划;

/**
 * Created by jww on 10.21.
 * Describe
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _最大自序和 {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        int max=dp[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }else {
                dp[i]=Math.max(dp[i-1],nums[i]);

            }
            max=Math.max(dp[i],max);
        }

        return max;
    }
}
