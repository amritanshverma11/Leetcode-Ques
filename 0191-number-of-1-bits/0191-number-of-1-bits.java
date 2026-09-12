class Solution {
    public int hammingWeight(int n) {
        int a=1,f=0;
        for(int i=1;i<32;i++)
        if((n&a)!=0)
        {
            f++;
           a= a<<1;
        }
        else
         a=a<<1;
        return f;

    }
}