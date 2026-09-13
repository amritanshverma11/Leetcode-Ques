class Solution {
    public int[] countBits(int n) {
       int []a=new int [n+1];
       for (int i=0;i<n+1;i++)
       {
            int o=0,x=i;

         while (x!=0){
           o+=x&1;
            x=x>>1;}
            a[i]=o;
       } 
       return a;
    }
}