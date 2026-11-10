public class Solution {
    public int climbStairs(int n, int[] costs) {
        // costs is 1-indexed in problem, so costs[i - 1] represents cost of step i
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int stepCost = costs[i - 1];
            int minVal = Integer.MAX_VALUE;

            // Check jump from i - 1 (jump length = 1, cost addition = 1^2 = 1)
            if (i >= 1) {
                minVal = Math.min(minVal, dp[i - 1] + 1);
            }
            // Check jump from i - 2 (jump length = 2, cost addition = 2^2 = 4)
            if (i >= 2) {
                minVal = Math.min(minVal, dp[i - 2] + 4);
            }
            // Check jump from i - 3 (jump length = 3, cost addition = 3^2 = 9)
            if (i >= 3) {
                minVal = Math.min(minVal, dp[i - 3] + 9);
            }

            dp[i] = stepCost + minVal;
        }

        return dp[n];
    }
}