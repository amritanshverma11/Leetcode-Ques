class Solution {
    public String removeOuterParentheses(String s) {
        
        StringBuilder a= new StringBuilder();
        int x=0;
        for(char c :s.toCharArray())
        {
            if(c=='(')
            if(x==0)
            {
                x++;
                continue;
            }
            else
            {
                a.append(c);
                x++;
            }
            else
            if(x==1)
            {
                x--;
                continue;
            }
            else
            {
                a.append(c);
                x--;
            }
        }
        return a.toString();
            }
}