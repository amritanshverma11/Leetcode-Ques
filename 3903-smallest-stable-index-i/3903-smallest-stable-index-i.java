class Solution {
    public int firstStableIndex(int[] n, int k) {
         for (int i=0;i<n.length;i++)
         {
            int m=Integer.MIN_VALUE,mm=Integer.MAX_VALUE;
         for (int j=0;j<n.length;j++)
        { 
            if (j<=i) m=Math.max(m,n[j]);
         if(j>=i) mm=Math.min(mm,n[j]);
         }
         if (m-mm <=k)
         return i;
         
         }
         return -1;
    }
}