import java.util.*;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, long k) {
        int n = nums.length;
        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++) pre[i + 1] = pre[i] + nums[i];

        Deque<long[]> dq = new ArrayDeque<>(); // {value, count}
        long total = 0, ans = 0;
        int r = n - 1;

        for (int l = n - 1; l >= 0; l--) {
            long v = nums[l], cnt = 1;
            total += v;

            while (!dq.isEmpty() && dq.peekFirst()[0] <= v) {
                long[] f = dq.pollFirst();
                total += (v - f[0]) * f[1];
                cnt += f[1];
            }
            dq.offerFirst(new long[]{v, cnt});

            while (total - (pre[r + 1] - pre[l]) > k) {
                long[] b = dq.peekLast();
                total -= b[0];
                if (--b[1] == 0) dq.pollLast();
                r--;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}