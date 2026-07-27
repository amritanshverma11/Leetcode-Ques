class Solution {
    int start, end;

    public String longestPalindrome(String s) {
        start = 0;
        end = 0;

        expand(s.toCharArray(), 0);

        return s.substring(start, end + 1);
    }

    public void expand(char[] s, int i){
        int n = s.length;

        if(i >= n){
            return;
        }
        int left = i;
        int right = i;

        while(right + 1 < n && s[i] == s[right + 1]){
            right++;
        }

        i = right + 1;

        while(right + 1 < n && left - 1 >= 0 && s[right + 1] == s[left - 1]){
            right++;
            left--;
        }

        if(end - start < right - left){
            end = right;
            start = left;
        }

        expand(s, i);
    }
}