class Solution {
    public int minInsertions(String s) {
        char c[]= s.toCharArray();
        char a[]= new char[c.length];
        int o=0,x=0,b=0,t=-1;
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='(')
            {
                a[++t]='(';
                o++;
            }
            else
            {
                if(t!=-1 && i+1<c.length &&c[i+1]==')')
                {
                  a[t--]=' ';
                  o--;  
                  i++;
                }
                else if(t==-1&&i+1<c.length &&c[i+1]==')')
                {
                    x++;
                    i++;
                }
                else if(t!=-1&&i+1<c.length &&c[i+1]!=')')
                {
                  a[t--]=' ';
                  o--;     
                    b++;
                }
                else if(t==-1&&i+1<c.length &&c[i+1]!=')')
                {
                    x++;
                    b++;
                }
                else if(i==c.length-1)
                {
                    if(t!=-1)
                    {
                        a[t--]=' ';
                         o--;
                         b++;
                    }
                    else {x++;b++;}
                }
            }
        }
        return (x+b+(2*o));
    }
}