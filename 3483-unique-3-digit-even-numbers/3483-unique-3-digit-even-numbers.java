class Solution {
    public int totalNumbers(int[] d)
    {
        int a [][]=new int[2] [10];
        for (int i=0;i<d.length;i++)
        {
            a[0][d[i]]=-1;
            a[1][d[i]]++;
            }
        int s=0;
        for (int i=100;i<999;i+=2)
        {
            int x=i/100;
            int f=a[1][x];
            int y=(i/10)%10;
            int ff=a[1][y];
            int z=i%10;
            int fff=a[1][z];
            a[1][x]--;
            a[1][y]--;
            a[1][z]--;
            if ((a[0][x]==-1&&a[1][x]>-1) && (a[0][y]==-1&&a[1][y]>-1) && (a[0][z]==-1&&a[1][z]>-1))
            s++;
             a[1][x]=f;
            a[1][y]=ff;
            a[1][z]=fff;
        }
        return s;
       
    }
}