class Solution {
    public String r(String s)
    {
        String ss="";
        for (int i=s.length()-1;i>=0;i--)
        ss=ss+s.charAt(i);
        return ss;
    }
    public String reverseStr(String s, int k) {
        if(s.length()<k)
        return r(s);
        else if((s.length()<=(k*2))&&(s.length()>=k))
        return r(s.substring(0,k))+s.substring (k);
        int i=0;String ss="";
        while (i<s.length())
        {
            if (i+k+k<s.length())
            ss=ss+r(s.substring(i,i+k))+s.substring(i+k,i+k+k);
            if (i+k+k>=s.length())
            if(i+k>=s.length())
             ss=ss+r(s.substring(i));
            else 
            ss=ss+r(s.substring(i,i+k))+s.substring(i+k);

            i=i+k+k;
            
        }
        
        return ss;
    }
}