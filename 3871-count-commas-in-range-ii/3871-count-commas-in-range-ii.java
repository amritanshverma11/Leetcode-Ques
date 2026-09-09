class Solution {
    public long countCommas(long n) {
        long x=(Long.toString(n).length());
        if (x<=3)return 0;
        x=(x-1)/3;
        long t=0;
        for (int i=1;i<x;i++)
        {
             t+=((Math.pow(1000,i+1)-Math.pow(1000,i)))*i;
        }
        t+=(n-(Math.pow(1000,x)-1))*x;
        return t;
    }
}