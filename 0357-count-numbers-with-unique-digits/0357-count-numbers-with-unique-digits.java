class Solution {
    public int f(int n)
    {
        if (n==0)
        return 1;
        if (n==1)return 10;
        int i=9;
        int p=1;
        while (i>9-(n-1))
        p*=i--;
        p*=9;
        return p+f(n-1);
    }
    public int countNumbersWithUniqueDigits(int n) {
        return f(n);
    }
}