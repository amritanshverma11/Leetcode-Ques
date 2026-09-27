class Solution {
    public String reverseParentheses(String ss) {
        StringBuilder s= new StringBuilder(ss);
              int i;
            while ((i = s.lastIndexOf("(")) != -1) 
            {
                StringBuilder a= new StringBuilder();
                char c= s.charAt(++i);
                while (c!=')')
                {
                    a.append(c);
                    c= s.charAt(++i);
                }
                a.reverse();
                s.replace(s.lastIndexOf("("),i+1,a.toString());
            }
        return s.toString();
    }
}