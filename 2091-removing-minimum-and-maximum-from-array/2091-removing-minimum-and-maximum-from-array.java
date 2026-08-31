class Solution {
    public int minimumDeletions(int[] n)
     {
        int i=-1,j=-1;
        int min =Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int k=0;k<n.length;k++)
        {
            if (n[k]<min)
            {
                min=n[k];
                i=k;
            }
            if (n[k]>max)
            {
                max=n[k];
                j=k;
            }
        }
        int a,b;
        if (i<j)
        {
            a=i;
            b=j;
        }
        else 
        {
            a=j;b=i;
        }
        int sum=0;
        if (a+1<n.length-b)
        {
            sum +=a+1;
            if ( n.length-b<b-a)
            sum+=n.length-b;
            else 
            sum+=b-a;
        }
        else
        {
            sum+=n.length-b;
            if (a+1<b-a)
            sum+=a+1;
            else 
            sum+=b-a;
        } 
         
    return sum;
     }
}