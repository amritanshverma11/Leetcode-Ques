class Solution {
    public boolean checkPerfectNumber(int n) {
        if(n%10 != 8 && n%10 != 6)
            return false;
       int s=1;
       for (int i=2; i<=n/2;i++)
       {
          if (n%i==0)
          s+=i;
       } 
       return s==n;
    }
}