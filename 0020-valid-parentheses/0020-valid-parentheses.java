class Solution {
    public boolean isValid(String ss) {
        Stack < Character> s= new Stack  <Character>();
        for(char c : ss.toCharArray())
        {
            if(s.empty()){
            if((c==')'||c==']'||c=='}'))
            return false ;
            else
            s.push(c);
            }
            else 
            {
                char cc=s.peek();
                if(c==')')
                if(cc=='(') s.pop();
                else return false ;
                else if(c==']')
                if(cc=='[') s.pop();
                else return false ;
                else if(c=='}')
                if(cc=='{') s.pop();
                else return false ;
                else s.push(c);
            }
        }
        if (s.empty())return true;
        return false;
    }
}