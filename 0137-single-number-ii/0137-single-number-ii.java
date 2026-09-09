class Solution {
    public int singleNumber(int[] n) {
        long [][]a= new long[2][(n.length/3)+1];
        Arrays.fill(a[0],Long.MIN_VALUE);
        int i=0;
        int j=0;
        while (i<n.length)
        {
            if (a[0][j]==Long.MIN_VALUE)
            {
                a[0][j]=n[i];
                a[1][j]++;
                i++;
                j=0;
                continue;

            }
           else if (n[i]==a[0][j])
            {
                a[1][j]++;
                i++;
                j=0;
                continue;
            }
            j++;
            
        }
        for (int ii=0;ii<a[1].length;ii++)
        if (a[1][ii]==1)return (int)a[0][ii];
        return -1;
    }
}