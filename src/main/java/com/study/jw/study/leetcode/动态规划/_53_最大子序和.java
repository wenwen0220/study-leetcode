package com.study.jw.study.leetcode.动态规划;

/**
 * Created by jww on 2020-08-21.
 * Describe:
 * https://leetcode-cn.com/problems/maximum-subarray/
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _53_最大子序和 {
    public static void main(String[] args) {
        System.out.println(maxArray1(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }
    /**
     * 这个思路好，可以优化到2，空间复杂度降低
     * 每个循环认为是以nums[i]为结尾且包含nums[i]的子序列
     * @param nums
     * @return
     */
    private static int maxArray1(int[] nums) {
        int[] dp = new int[nums.length];
        int max = dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] < 0) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    private static int maxArray2(int[] nums) {
        int dp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp < 0) {
                dp = nums[i];
            } else {
                dp = dp + nums[i];
            }
            max = Math.max(max, dp);
        }
        return max;
    }

}
