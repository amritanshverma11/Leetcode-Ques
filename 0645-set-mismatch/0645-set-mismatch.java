class Solution {
    public int[] findErrorNums(int[] n) {
        int a[]= new int [2];
        int m[]= new int [n.length];
        for (int i=0;i<n.length;i++)
        {
            m[n[i]-1]++;
            if (m[n[i]-1]==2)
            a[0]=n[i];

        }
        for (int i=0;i<m.length;i++)
        if (m[i]==0)
        {
            a[1]=i+1;
            break;
        }
        return a;
    }
}