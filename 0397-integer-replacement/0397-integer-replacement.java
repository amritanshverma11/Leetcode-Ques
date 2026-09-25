class Solution {
    public int integerReplacement(int nn) 
    {
        long n=nn;
        int w=0;
        while (n>1)
        if ((n&1)==0)
        {
            w++;
            n=n>>1;
        }
        else if (n==3||(n&2)==0) 
        {
            w++;
            n=n-1;
        }
        else{
            w++;
            n=n+1;
        }
         return w;

    }
}