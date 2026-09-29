class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int f=0;
        for(int i=0;i<t.length-1;i++)
            f+=((t[i+1]-t[i])<d)?(t[i+1]-t[i]):d;
            return f+d;
    }
}