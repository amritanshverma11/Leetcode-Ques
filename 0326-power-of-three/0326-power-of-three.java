class Solution {
    public boolean isPowerOfThree(int n) 
    {
        double d=Math.log(n)/Math.log(3);
        return Math.abs(d - Math.round(d)) < 1e-10;
    }
}