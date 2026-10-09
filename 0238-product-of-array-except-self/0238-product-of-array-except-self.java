class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,pp=1,z=0;
        for(int i:nums)
        {p*=i;
        if(i!=0)
        pp*=i;
        else z++;
        }
        int a[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]==0)
            if(z>1)
            a[i]=0;
            else a[i]=pp;
            else
        a[i]=p/nums[i];
        }return a;
    }
}