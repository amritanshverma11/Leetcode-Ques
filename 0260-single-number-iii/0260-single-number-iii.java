class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet <Integer> a= new HashSet<>();
        for(int n:nums)
        if (a.contains(n))
        a.remove(n);
        else a.add(n);
        int f[]= new int[2];
        int i=0;
        for(int x:a)
        f[i++]=x;
        return f;
    }
}