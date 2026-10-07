class Solution {
    public int trailingZeroes(int n) {
        int f=0,t=0;
        while(n>1)
        {
            int x=n;
            while(x%2==0)
            {
                t++;
                x=x/2;
            }
            x=n;
            while(x%5==0)
            {
                f++;
                x=x/5;
            }
            n--;
        }
        return (int)Math.min(f,t);
    }
}