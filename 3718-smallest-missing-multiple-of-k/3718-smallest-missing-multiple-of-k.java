class Solution {
    public boolean f(int []n,int a)
    {
        for (int i=0;i<n.length;i++)
            if (a==n[i])
            return true;
            return false ;
    }
    public int missingMultiple(int[] nums, int k) {
        int i=1,ff=0;
        while (ff==0)
        {
            if( !f(nums ,k*i++))
            return k*(i-1);
        }
        return 0;

    }
}