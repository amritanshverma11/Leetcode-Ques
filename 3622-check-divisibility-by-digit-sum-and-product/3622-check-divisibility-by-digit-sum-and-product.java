class Solution {
    public boolean checkDivisibility(int n) {
        int nn=n, s=0,p=1;
        while (n>0)
        {
            s+=n%10;
            p*=n%10;
            n=n/10;
        }
        int a=s+p;
        return (nn%a==0); 
        }
}