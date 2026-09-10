class Solution {
    public int r(int []h,int i )
    {
        int a=-1,b=i;
        for (int j=i+1;j<h.length;j++)
        if (h[j]>a)
        {
            b=j;
            a=h[j];
        }
        return b;
        
    }
    public int trap(int[] h) {
        int i=0;
        int s=0;
        while(i<h.length)
        { int j=i+1;
            while (j<h.length && h[i]>h[j] )
            j++;
            if (j==h.length){
                j = r(h, i);

                 if (j == i) {
                   i++;
                     continue;
                          }

               int t = h[j] * (j-i-1);

               for (int k=i+1; k<j; k++)
                     t -= h[k];

                        s += t;
                           i = j;
                                continue;
                           }
            else if (h[j]>=h[i])
             {
                int  t= h[i]*(j-i-1);
                for (int k=i+1;k<j;k++)
                t-=h[k];
                s=s+t;
                i=j;
                continue ;
             }
             i++;
        }
        return s ;
    }
}