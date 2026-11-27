class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int minPrice = Integer.MAX_VALUE;
        for (int[] it : items) minPrice = Math.min(minPrice, it[1]);

        long[] dp = new long[budget + 1];
        for (int b = 0; b <= budget; b++) dp[b] = b / minPrice;

        for (int i = 0; i < n; i++) {
            long free = 0;
            for (int j = 0; j < n; j++) {
                if (j != i && items[j][0] % items[i][0] == 0) free++;
            }
            long val = 1 + free;
            int cost = items[i][1];

            for (int b = budget; b >= cost; b--) {
                dp[b] = Math.max(dp[b], dp[b - cost] + val);
            }
        }
        return (int) dp[budget];
    }
}