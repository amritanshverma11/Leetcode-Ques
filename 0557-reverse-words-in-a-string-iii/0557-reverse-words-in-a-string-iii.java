class Solution {
    public String reverseWords(String s) {
        s=s+" ";
        String a="";
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            if (Character.isWhitespace(s.charAt(i)))
            {
                sb.reverse();
                a=(i==s.length()-1)?a+sb:a+sb+" ";
                sb = new StringBuilder();
            }
            else sb.append(s.charAt(i));
        }
        return a;
    }
}