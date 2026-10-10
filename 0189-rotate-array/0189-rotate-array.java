class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        int a[]=new int [l];
        k=k%l;
        int x=0;
        for(int i=l-k;i<l;i++)
        a[x++]=nums[i];
        for(int i=0;i<l-k;i++)
        a[x++]=nums[i];
        x=0;
        for(int i:a)
        nums[x++]=i;
    }
}