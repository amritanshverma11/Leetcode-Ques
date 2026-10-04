class Solution {
    public void merge(int[] a, int mm, int[] b, int nn) {
         int i=mm+nn-1,m=mm-1,n=nn-1;
        if(mm==0)
        for(int ii=0;ii<nn;ii++)
        a[ii]=b[ii];
        else if(nn!=0)
       while(i>-1)
        if(a[m]>=b[n])
        {a[i]=a[m]; if(i!=-1&&i!=m)a[m]=Integer.MIN_VALUE;--i; if(m>0)--m;}
        else if(b[n]>a[m])
        {a[i--]=b[n];b[n]=Integer.MIN_VALUE; if(n>0)--n;}
    }
}