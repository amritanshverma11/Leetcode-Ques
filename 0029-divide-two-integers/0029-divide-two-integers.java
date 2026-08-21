class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long dd = dividend;
        long d = divisor;

        // Sign
        boolean negative = (dd < 0) != (d < 0);

        // Absolute values
        dd = Math.abs(dd);
        d = Math.abs(d);

        long ans = 0;

        while (dd >= d) {

            long temp = d;
            long multiple = 1;

            // Divisor ko maximum possible double karo
            while (dd >= temp + temp) {
                temp += temp;
                multiple += multiple;
            }

            // Us amount ko dividend se subtract karo
            dd -= temp;
            ans += multiple;
        }

        if (negative)
            ans = -ans;

        return (int) ans;
    }
}