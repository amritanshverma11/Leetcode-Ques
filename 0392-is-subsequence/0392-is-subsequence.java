class Solution {
    public boolean isSubsequence(String s, String t) {
        String tt=t;
        for(int i=0;i<s.length();i++)
        {
            if(tt.indexOf(s.charAt(i))==-1)
            return false ;
            else
            {
                tt=tt.substring(tt.indexOf(s.charAt(i))+1);
            if(i<s.length()-1)
            if(t.indexOf(s.charAt(i))>t.indexOf(s.charAt(i))+(t.substring(t.indexOf(s.charAt(i))+1).indexOf(s.charAt(i+1))))
            return false;
            }

        }
        return true ;
    }
}