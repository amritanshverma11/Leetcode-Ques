class Solution {
    public int hammingWeight(int n) {
        int f=0;
        while(n!=0){
        if((n&1)!=0)
         f++;
         n=n>>1;
         }
        return f;

    }
}