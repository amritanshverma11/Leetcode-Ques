class Solution {
    public int threeSumClosest(int[] n, int t) 
    {
        int s=Integer.MAX_VALUE-10;
        for(int i=0;i<n.length-2;i++)
        for(int j=i+1;j<n.length-1;j++)
        for(int k=j+1;k<n.length;k++)
        if(Math.abs(t-(n[i]+n[j]+n[k]))<Math.abs(t-s))
        s=n[i]+n[j]+n[k];
        return s;
    }
}