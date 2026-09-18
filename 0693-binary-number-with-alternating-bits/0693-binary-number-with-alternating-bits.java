class Solution {
    public boolean hasAlternatingBits(int n) {
        int i=n&1;
        n=n>>1;
        while(n!=0)
        {
            if(i==(n&1))
            return false ;
            else 
            {
                i=n&1;
                n=n>>1;
            }   
        }
        return true ;
    }
}