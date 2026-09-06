class Solution {
    
    public int countPrimes(int n) {
        if (n<=2)
        return 0;
        int t=0;
        boolean [] b=new boolean [n];
        b[0]=false ;
        b[1]=false;
        for (int i=2;i<n;i++)
        b[i]=true;
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if (b[i])
            {
                for (int j=i*i;j<n;j+=i)
                b[j]=false;
            }
        }
        for (int i=2;i<n;i++)
        if (b[i])t++;
        return t;
    }
}