class Solution {
    public int findMaxConsecutiveOnes(int[] n) {
        int s=0,m=0;
        for (int i=0;i<n.length;i++)
            if(n[i]==1)s++;
            else if (n[i]==0){
                m=Math.max(m,s);
                s=0;
            }
            return Math.max(m,s);
    }
}