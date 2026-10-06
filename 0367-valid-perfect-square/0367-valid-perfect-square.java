class Solution {
    public boolean isPerfectSquare(int n) {
        long l = 1;
        long r = n;

        while (l <= r) {
            long mid =(r + l) / 2;
            long sq = mid * mid;

            if (sq == n)
                return true;

            if (sq < n)
                l = mid + 1;
            else
                r = mid - 1;
        }

        return false;
    }
}