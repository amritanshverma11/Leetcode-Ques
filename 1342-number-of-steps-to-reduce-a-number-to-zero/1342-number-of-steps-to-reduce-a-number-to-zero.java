class Solution {
    public int numberOfSteps(int n) {
        int w=0;
        while(n>0)
        {
            if((n&1)==0)
            {
                n=n>>1;
                w++;
            }
            else 
            {
                n--;w++;
            }
        }
        return w;
    }
}