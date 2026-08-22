class Solution {
    public String a(String s,String ss)
    {
        if(s=="0")
        return ss;
        else if (ss=="0")
        return s;
        String f="";
        int a=s.length()-1,b=ss.length()-1;
        int c=0;
        while (a>=0||b>=0)
        {
            char p='0',q='0';
            if(a>-1)
            p=s.charAt(a--);
            if(b>-1)
            q=ss.charAt(b--);
            int e=p-'0';
            int r=q-'0';
            int y=e+r+c;
            f=Integer.toString(y%10)+f;
            c=y/10;
        }
    return (c==1)?("1"+f):f;
    }
    public String m(String s,int x,int z)
    {
        if(x==0)return "0";
        int l=s.length()-1,c=0;
        String f="";

        while (l>=0)
        {
            int a=(s.charAt(l--)-'0');
            f=Integer.toString(((a*x)+c)%10)+f;
             c= ((a*x)+c)/10;
             }
            f= (c==0)?f:Integer.toString(c)+f;
            while (z>0)
            {f=f+"0";z--;}
            return f;

    }
    public String multiply(String n, String m) {
        String a,b;
        if(n.length()>=m.length())
        {
            a=n;b=m;
        }
        else 
        {
            a=m;b=n;
        }
        String f="0";
        for (int i=b.length()-1;i>-1;i--)
        {
            int x=b.charAt(i)-'0';
            f=a(f,m(a,x,b.length()-1-i));
        }
        return f;
    
    }
}






















