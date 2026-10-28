class Solution {
    public int[] twoSum(int[] n, int t) {
        
      int l=0,r=n.length-1;
      while(l<r)
      {
        int a=n[l]+n[r];
        if (a==t)return new int []{l+1,r+1};
        else if (t>a)l++;
        else r--;
      }
        return new int[] {};
    }
}