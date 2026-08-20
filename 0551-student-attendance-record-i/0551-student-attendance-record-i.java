class Solution {
    public boolean l(String s )
    {
        int i=s.indexOf('L');
        while((i<=s.length()-3)&&(i!=-1))
        {
            String ss ="";
            if(i+3==s.length())
            ss=s.substring(i);
            else 
            ss=s.substring(i,i+3);
            if("LLL".equals(ss))
            return false ;
            s=s.substring(0,i)+s.substring(i+1);
            i=s.indexOf('L');
        }
        return true ;
    }
    public boolean checkRecord(String s) {
        if(s.indexOf('A')==-1)
        {
            if(s.indexOf('L')==-1)
            return true ;
            else
            return l(s);

        }
        else
        {
            if(s.indexOf('A')==s.lastIndexOf('A'))
            {
                if(s.indexOf('L')==-1)
            return true ;
            else
            return l(s);


            }
            else
            return false;
        }
    }
}