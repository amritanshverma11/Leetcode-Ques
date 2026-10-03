class Solution {
    public int longestValidParentheses(String s) {
        int l=0;
        char c[]=s.toCharArray();
        for(int i=1;i<s.length();i++)
        {
            if(c[i]==')')
            {
                int x=i;
                x--;
                while(x>-1&&c[x]==' ')
                x--;
                if(x==-1)continue;
                if(c[x]=='('&&c[i]==')')
                {c[x]=' ';c[i]=' ';}
            }
        }
        int m=0;
        int a=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==' ')
            {a++;
            m=Math.max(a,m);
            }
            else a=0;
        }
        return m;
    }
}