class Solution {
    public int firstStableIndex(int[] n, int k) {
         int l=n.length;
        int m[]=new int [l];
        m[l-1]=n[l-1];
        for (int i=l-2;i>=0;i--)
            m[i]=(n[i]<m[i+1])?n[i]:m[i+1];
            int mm=Integer.MIN_VALUE;
        for (int i=0;i<l;i++)
        {
            if (n[i]>mm)
            mm=n[i];
            if(mm-m[i]<=k)
            return i;
        }
        return -1;
    }
}