package com.rahul.kumar.Module8_Day61_DP2_TwoDimentional;

import java.util.Arrays;

public class Program3_A_DigitNumber_Memoization {
    private static final int MOD = 1000000007;

    static int countDigit(int A, int B) {
        int[][] dp = new int[A + 1][B + 1];

        for (int i = 0; i <= A; i++) {
            Arrays.fill(dp[i], -1);
        }

        int answer = 0;

        for (int i = 1; i < 10; i++) {
            if (B - i >= 0) {
                answer = (answer + recursiveApproach(A - 1, B - i, dp)) % MOD;
            }
        }
        return answer;
    }

    static int recursiveApproach(int digit, int sum, int[][] dp) {
        if (digit == 0 && sum == 0) {
            return 1;
        }

        if (sum < 0) {
            return 0;
        }

        if (digit <= 0) {
            return 0;
        }

        if (dp[digit][sum] != -1) {
            return dp[digit][sum];
        }

        int ans = 0;

        for (int i = 0; i < 10; i++) {
            ans = (ans + recursiveApproach(digit - 1, sum - i, dp)) % MOD;
        }

        dp[digit][sum] = ans;
        return dp[digit][sum];
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 4;
        System.out.println(countDigit(A, B));
    }
}
