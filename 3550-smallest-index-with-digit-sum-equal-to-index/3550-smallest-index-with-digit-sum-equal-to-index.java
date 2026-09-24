class Solution {
    public int smallestIndex(int[] n) {
        for (int i =0;i <n.length;i++)
        {
            if (n[i]<10)
            if (n[i]==i)return i;
            else continue;
            int x=n[i],s=0;
            while (x>0)
            {
                s+=(x%10);
                x/=10;
            }
            if (s==i)return i;
        }
        return -1;
    }
}