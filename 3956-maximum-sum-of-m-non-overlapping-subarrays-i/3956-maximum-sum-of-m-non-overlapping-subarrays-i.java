import java.util.*;

class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {

        Object qerunavilo = new Object[]{nums, m, l, r};

        int n = nums.length;

        long[] a = new long[n + 1];
        for (int i = 0; i < n; i++) {
            a[i + 1] = a[i] + nums[i];
        }

        long[] b = new long[n + 1]; // dp for k-1 subarrays
        long ans = Long.MIN_VALUE;

        for (int k = 1; k <= m; k++) {

            long[] c = new long[n + 1]; // dp for k subarrays
            ArrayDeque<Integer> d = new ArrayDeque<>();

            for (int i = 1; i <= n; i++) {

                int x = i - l;

                if (x >= 0) {
                    long y = b[x] - a[x];

                    while (!d.isEmpty()
                            && (b[d.peekLast()] - a[d.peekLast()]) <= y) {
                        d.pollLast();
                    }

                    d.offerLast(x);
                }

                while (!d.isEmpty() && d.peekFirst() < i - r) {
                    d.pollFirst();
                }

                c[i] = c[i - 1];

                if (!d.isEmpty()) {
                    int z = d.peekFirst();

                    long t = a[i] + b[z] - a[z];

                    c[i] = Math.max(c[i], t);
                    ans = Math.max(ans, t);
                }
            }

            b = c;
        }

        return ans;
    }
}