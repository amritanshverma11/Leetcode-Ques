class Solution {
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
        int x=xc-Math.max(x1,Math.min(xc,x2));
        int y=yc-Math.max(y1,Math.min(yc,y2));
        int d=(x*x)+(y*y);
        r=r*r;
        return (d<=r);
    }
}