class Solution {
    public boolean isRectangleOverlap(int[] r, int[] e) {
        if ((r[0]<e[0]&&e[0]<r[2])||(r[0]<e[2]&&e[2]<r[2])||(e[0]<r[0]&&r[0]<e[2])||(e[0]<r[2]&&r[2]<e[2])||(r[0]==e[0]&&r[2]==e[2]))
            if((r[1]<e[1]&&e[1]<r[3])||(r[1]<e[3]&&e[3]<r[3])||(e[1]<r[1]&&r[1]<e[3])||(e[1]<r[3]&&r[3]<e[3])||(r[1]==e[1]&&r[3]==e[3]))
            return true;
        
         return false;
    }
}