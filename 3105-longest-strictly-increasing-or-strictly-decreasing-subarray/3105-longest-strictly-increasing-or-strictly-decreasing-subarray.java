class Solution {
    public int longestMonotonicSubarray(int[] n ) {
        int a=0;int b=0;
        int x=0,xx=0;
        for(int i=0;i<n.length-1;i++)
            {if(n[i]>n[i+1])a++;
            else
            {
                x=Math.max(x,a);a=0;
            }
            if(n[i]<n[i+1])b++;
            else 
            {
                xx=Math.max(xx,b);b=0;
            }
            }x=Math.max(x,a);xx=Math.max(xx,b);
        return Math.max(x,xx)+1;

    }
}