
import java.math.BigInteger;

class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 1;

        for (int i = 0; i < n; i++) {
            BigInteger prod = BigInteger.ONE;
            BigInteger lcm = BigInteger.ONE;
            int gcd = 0;

            for (int j = i; j < n; j++) {
                BigInteger x = BigInteger.valueOf(nums[j]);

                prod = prod.multiply(x);

                gcd = gcd(gcd, nums[j]);

                lcm = lcm.divide(lcm.gcd(x)).multiply(x);

                BigInteger result = lcm.multiply(
                    BigInteger.valueOf(gcd)
                );

                if (prod.equals(result)) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
