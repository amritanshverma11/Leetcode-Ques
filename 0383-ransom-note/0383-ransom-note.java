class Solution {
    public boolean canConstruct(String r, String m) {
        if(r.length()>m.length())
        return false ;
        for(int i=0;i<r.length();i++)
        if(m.indexOf(r.charAt(i))==-1)
        return false;
        else
        m=m.substring(0,(m.indexOf(r.charAt(i))))+m.substring((m.indexOf(r.charAt(i))+1));
        return true;
    }
}