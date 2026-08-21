class Solution {
    public int climbStairs(int n) {

        int a = n;
        int b = 0;
        int ans = 0;

        while (a >= 0) {

            // (a+b)! / (a! * b!)
            long c = 1;

            for (int i = 1; i <= b; i++) {
                c = c * (a + i) / i;
            }

            ans += c;

            a -= 2;
            b++;
        }

        return ans;
    }
}