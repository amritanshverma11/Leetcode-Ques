class Solution {
    public int nthUglyNumber(int n) {
     int u[]=new int [n];
     u[0]=1;
     int a=0,b=0,c=0;
     for (int i=1;i<n;i++)
     {
        u[i]=Math.min(u[a]*2,Math.min(u[b]*3,u[c]*5));
        if ( u[i]==u[a]*2)
        a++;
        if ( u[i]==u[b]*3)
        b++;
        if ( u[i]==u[c]*5)
        c++;
       }
       return u[n-1];
    }
}