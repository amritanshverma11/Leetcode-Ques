class Solution {
    public int pivotIndex(int[] nums) {
        int s=0;
        for(int i:nums)
        s+=i;
        int a[][]= new int [2][nums.length];
        a[0][0]=0;a[1][0]=s-nums[0];
        if (a[0][0]==a[1][0])return 0;
        for(int i=1;i<nums.length;i++)
        {
            a[0][i]=(a[0][i-1]+nums[i-1]);
            a[1][i]=(a[1][i-1]-nums[i]);
            if (a[0][i]==a[1][i])return i;
        }
        return -1;
    }
}