class Solution {
    public int maxArea(int[] a) {

        int left = 0;
        int right = a.length - 1;

        int mw = 0;

        while(left < right) {

            int area = Math.min(a[left], a[right]) * (right - left);

            mw = Math.max(mw, area);

            if(a[left] < a[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return mw;
    }
}