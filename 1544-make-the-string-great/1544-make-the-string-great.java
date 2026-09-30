class Solution {
    public String makeGood(String s) {
        if(s=="")return s;
        Stack <Character> st = new Stack <Character>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(st.empty())
            {
                st.push(c);
                continue;
            }
            else 
            {
                if(Math.abs(st.peek()-c)==32)
                {
                    st.pop();
                    continue;
                }
                st.push(c);
            }
        }
        StringBuilder a= new StringBuilder();
        while(!st.empty())
        a.append(st.pop());
        a.reverse();
        return a.toString();

    }
}