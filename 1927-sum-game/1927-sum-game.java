class Solution {
    public int a(String s)
    {
        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='?')continue ;
        f+=(s.charAt(i))-'0';}
        return f;
    }
    public boolean sumGame(String num) {
        String s=num.substring(0,num.length()/2),ss=num.substring(num.length()/2);
            int r=0,l=0;
            for (int i=0;i<s.length();i++)
            {
                if (s.charAt(i)=='?')
                l++;
                if (ss.charAt(i)=='?')
                r++;
            }
            int sa=a(s),sb=a(ss);
            if(l>r&&sa>sb)return true;
            else if (r>l&&sb>sa)return true ;
            int f=((l-r)<0)?r-l:l-r;
            if (f%2!=0)return true ;
            
            if(f==0)
            return !(sa==sb);
            int d=((sa-sb)<0)?sb-sa:sa-sb;
           if (d==(9*(f/2)))
           return false ;
           return true ;
        
        
    }
}