class Solution {
    public int maxProduct(int[] n) {
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=0;j<n.length-1-i;j++)
            {
                if(n[j]>n[j+1]){
                int t=n[j];
                n[j]=n[j+1];
                n[j+1]=t;}
            }
        }

        if(((n[0]-1)*(n[1]-1))>((n[n.length-2]-1)*(n[n.length-1]-1)))
        return (n[0]-1)*(n[1]-1);
        return (n[n.length-2]-1)*(n[n.length-1]-1);
    }
}