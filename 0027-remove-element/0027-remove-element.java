class Solution {
    public int removeElement(int[] n, int v)
    {
        int f=0;
        int l=n.length-1;
        for(int i=0;i<l;i++)
        {
            while (l>i && n[l]==v)
           { f+=1;--l;}
            if(n[i]==v)
           {
            int t=n[l];
            n[l]=n[i];
            n[i]=t;
           }
           }
           int i;
           for(i=0;i<n.length;i++)
            if(n[i]==v)
            break;
            return i;
        
    }
}