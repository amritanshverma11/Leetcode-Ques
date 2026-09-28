class Solution {
    public int maxDepth(String s) {
        int d=0,m=0;
        for (char c:s.toCharArray())
        {
            if (c==')')
            d--;
            if (c!='(')
            continue;
            d++;
            if (d>m)m=d;
        }
        return m;
    }
}