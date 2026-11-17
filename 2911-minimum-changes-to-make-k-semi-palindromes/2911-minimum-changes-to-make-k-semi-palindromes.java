import java.util.Arrays;

class Solution {
    public int minimumChanges(String s, int k) {
        int n = s.length();
        int[][] cost = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                cost[i][j] = costToSemiPalindrome(s, i, j);
            }
        }

        int[][] dp = new int[n + 1][k + 1];
        final int INF = Integer.MAX_VALUE / 2;
        for (int[] row : dp) Arrays.fill(row, INF);
        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                // m <= i - 2 ensures each partition has length >= 2
                for (int m = j - 1; m <= i - 2; m++) {
                    if (m < 0 || dp[m][j - 1] == INF) continue;
                    int candidate = dp[m][j - 1] + cost[m][i - 1];
                    if (candidate < dp[i][j]) {
                        dp[i][j] = candidate;
                    }
                }
            }
        }

        return dp[n][k];
    }

    private int costToSemiPalindrome(String s, int l, int r) {
        int length = r - l + 1;
        int best = Integer.MAX_VALUE;

        for (int d = 1; d < length; d++) {
            if (length % d != 0) continue;
            int total = 0;
            for (int start = 0; start < d; start++) {
                int i = l + start;
                int j = r - (d - 1 - start);
                while (i < j) {
                    if (s.charAt(i) != s.charAt(j)) total++;
                    i += d;
                    j -= d;
                }
            }
            best = Math.min(best, total);
        }

        return best;
    }
}