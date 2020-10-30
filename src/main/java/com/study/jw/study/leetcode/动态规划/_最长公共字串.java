package com.study.jw.study.leetcode.动态规划;

/**
 * Created by jww on 2020／10／28.
 * Describe
 * "1AB2345CD","12345EF"
 * "2345"
 */
public class _最长公共字串 {
    public String LCS(String str1, String str2) {
        // write code here
        int m = str1.length();
        int n = str2.length();
        if (m == 0 || n == 0) return "-1";
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        int index = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (chars1[i - 1] == chars2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (max < dp[i][j]) {
                        max = dp[i][j];
                        index = i - 1;
                    }

                }
                max = Math.max(max, dp[i][j]);
            }
        }
        if (max == 0) return "-1";
        return str1.substring(index - max + 1, index);
    }
}
