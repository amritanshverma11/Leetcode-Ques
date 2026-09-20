class Solution {
    public int reverseDegree(String s) {
       int ss=0;
       for (int i=0;i<s.length();i++)
        ss+=(123-s.charAt(i))*(i+1);
        return ss;
       
    }
}