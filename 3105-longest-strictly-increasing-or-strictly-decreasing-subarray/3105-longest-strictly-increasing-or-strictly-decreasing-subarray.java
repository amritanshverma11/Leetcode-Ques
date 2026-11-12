class Solution {
    public int longestMonotonicSubarray(int[] n ) {
        int a[]=new int [n.length];int b[]=new int [n.length];
        for(int i=0;i<n.length-1;i++)
            if(n[i]>n[i+1])a[i]=1;
            else if(n[i]<n[i+1])b[i]=1;
        int x=0,xx=0;int y=0,yy=0;
        for(int i=0;i<n.length;i++)
        {
            if(a[i]==1)xx++;
            else {x=Math.max(x,xx);xx=0;}
            if(b[i]==1)yy++;
            else {y=Math.max(y,yy);yy=0;}
        }
        return Math.max(x,y)+1;

    }
}