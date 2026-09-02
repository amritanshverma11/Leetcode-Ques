class Solution {
    public int uniquePaths(int m, int n) {
        long   ans =1;
        int r=Math.min(m-1,n-1);
        int nn =m+n-2;
        for (int i =1;i<=r;i++)
        ans =ans *(nn-r+i)/i;
        return (int) ans ;

    }
}