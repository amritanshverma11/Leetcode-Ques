class Solution {
    public int minAddToMakeValid(String s) {
        int i=0;
        Stack<Character>a= new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {a.push(c);continue;}
            if(c==')')
            {
                if(a.isEmpty())
                {i++;continue;}
                a.pop();
            }
        }
        return a.size()+i;
    }
}