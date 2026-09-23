class Solution {
    public int minOperations(int[] n, int x) {

        int total = 0;

        for (int num : n) {
            total += num;
        }

        int target = total - x;

        // Agar poora array remove karna hai
        if (target == 0) {
            return n.length;
        }

        int l = 0;
        int sum = 0;
        int maxLen = -1;

        for (int r = 0; r < n.length; r++) {

            sum += n[r];

            while (sum > target && l <= r) {
                sum -= n[l];
                l++;
            }

            if (sum == target) {
                maxLen = Math.max(maxLen, r - l + 1);
            }
        }

        if (maxLen == -1) {
            return -1;
        }

        return n.length - maxLen;
    }
}