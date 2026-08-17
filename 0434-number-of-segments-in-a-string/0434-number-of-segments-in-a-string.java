class Solution {
    public int countSegments(String s) {
        if(s.length()==0)return 0;
        s=s.trim();s=s+" " ;
        int l=0,f=0;
        for (int i=0;i<s.length();i++)
        {
            if(!Character.isWhitespace(s.charAt(i)))
            l=1;
            else if(Character.isWhitespace(s.charAt(i)))
            {
                if(l==1)
                f++;
                l=0;
            }

            }
        return f ;
    }
}