class Solution {
    public int firstUniqChar(String s) {
        
        for (int i=0;i<s.length();i++)
        {
            String a="";
            if (i==0)
            a=s.substring(1);
            else if (i==s.length()-1)
            a=s.substring(0,s.length()-1);
            else a=s.substring(0,i)+s.substring(i+1);
            if (a.indexOf(s.charAt(i))==-1)
            return i;
        }
        return -1;
    }
}