class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        int a[]=new int [n1.length];
       for (int i=0;i<n1.length;i++)
       {
        int f=-100;
        for (int j=0;j<n2.length;j++)
        {
            if (n1[i]==n2[j])
            f++;
            else if (f==-100)continue;
            else if ((f!=-100)&& n2[j]>n1[i])
            {
                f=j;
                break;
            }
        }
        a[i]=(f<0)?-1:n2[f];
       }
       return a;
    }
}