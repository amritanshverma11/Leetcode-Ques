class Solution {
    public String mergeAlternately(String w1, String w2) {
        int a=w1.length(),b=w2.length();
        String w =(a<=b)?w1:w2;
        String x =(a<=b)?w2:w1;
        StringBuilder s= new StringBuilder();
        for(int i=0;i<w.length();i++)
        {
            s.append(w1.charAt(i));
            s.append(w2.charAt(i));
        }
        s.append(x.substring(w.length()));
        return s.toString();
    }
}