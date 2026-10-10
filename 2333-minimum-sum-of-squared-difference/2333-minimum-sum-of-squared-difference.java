
class Solution {
    public long minSumSquareDiff(int[] n1, int[] n2, int k1, int k2) {
        int k = k1 + k2;
        int max = 0;

        for (int i = 0; i < n1.length; i++) {
            int d = Math.abs(n1[i] - n2[i]);
            max = Math.max(max, d);
        }

        int[] freq = new int[max + 1];

        for (int i = 0; i < n1.length; i++) {
            int d = Math.abs(n1[i] - n2[i]);
            freq[d]++;
        }

        for (int d = max; d > 0 && k > 0; d--) {
            int take = Math.min(freq[d], k);

            freq[d] -= take;
            freq[d - 1] += take;
            k -= take;
        }

        long ans = 0;

        for (int d = 1; d < freq.length; d++) {
            ans += (long) d * d * freq[d];
        }

        return ans;
    }
}
