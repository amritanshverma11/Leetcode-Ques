class Solution {
    public int sumOfUnique(int[] nums) {
        int [] a= new int [101];
        for (int i:nums)
        a[i]++;
        int s=0;
        for (int i=1;i<101;i++)
        if (a[i]==1)
        s+=i;
        return s;
    }
}