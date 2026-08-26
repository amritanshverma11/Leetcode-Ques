class Solution {
    public boolean c(String s,int k)
    {
        for (int i=0;i<s.length();i++)
        if (s.charAt(i)=='1')
        k--;
        return (k==0);

    }
    public String ls(String a,String b)
    {
        String s,ss;
        if(a.length()>b.length())
        {s=a;ss=b;}
        else 
       { s=b;ss=a;}
       for(int i =0;i<ss.length();i++)
       {
        if (s.charAt(i)!=ss.charAt(i))
        return (s.charAt(i)=='0')?s:ss;
       }
    return ss;
    }
    public String shortestBeautifulSubstring(String s, int k) {
        int i=k;
        String d="",ss="";
        while (i<=s.length())
        {
            for (int j=0;j<=s.length()-i;j++)
            {
                ss=s.substring(j,j+i);
                if (c(ss,k))
                {
                    if(d.isEmpty())
                    d=ss;
                    else 
                    d= ls(d,ss);
                }
                }
                if(!d.isEmpty())
                return d;
            
            i++;
        }
        return d;
    }
}