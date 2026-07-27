class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int m=n1.length,n=n2.length,mm=m+n;
        int ma []=new int [mm];int p=0,q=0;
        
         for(int i=0;i<mm;i++)
        if (q>=n)
        {
            ma[i]=n1[p];
            if(p<m)
            p++;
        }
        else if (p>=m)
        {
            ma[i]=n2[q];
             if(q<n)
            q++;
        } 
       else if(n1[p]<n2[q])
        {
            ma[i]=n1[p];
            if(p<m)
            p++;
        }
        else if(n2[q]<n1[p])
        {
             ma[i]=n2[q];
             if(q<n)
            q++;
        }
        else if (n1[p]==n2[q])
        {
             ma[i]=n1[p];
             if(p<m)
            p++;
        }


        if(mm%2!=0)
        return ma[((mm+1)/2)-1];
        else
        return ((ma[(mm/2)-1]+ma[mm/2])/2.0);
        
    }
}