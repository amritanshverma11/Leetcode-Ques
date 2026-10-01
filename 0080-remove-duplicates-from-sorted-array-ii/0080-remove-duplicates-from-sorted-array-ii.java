class Solution {
    public int removeDuplicates(int[] n) {
       int k=1;
       int []a= new int [n.length];
       int f=1;
       a[0]=n[0];
       for(int i=1;i<n.length;i++)
       {
            if(a[k-1]==n[i])
            {
                if(f<2)
                {
                    f++;
                    a[k]=n[i];
                    k++;
                }
                else continue;
            }
            else
            {
                f=1;
                a[k]=n[i];
                k++;
            }
       }
       for(int i=0;i<k;i++)
       n[i]=a[i];
       return k;
    }
}