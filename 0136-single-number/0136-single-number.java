class Solution {
    public int singleNumber(int[] n)
    { int result = 0;
        for (int i=0;i<n.length;i++ )
            result ^= n[i];
        return result;
    }
}