class Solution {
    public int minMoves(int[] nums) {
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            m=Math.max(nums[i],m);
        }
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
           s+=m-nums[i];
        }
        return s;
    }
}