class Solution {
    public String gcdOfStrings(String st1, String st2) {
       StringBuilder s1,s2;
       if(st1.length()>st2.length()) 
        {
            s1=new StringBuilder(st1);
            s2=new StringBuilder(st2);
        }
        else
        {
            s1=new StringBuilder(st2);
            s2=new StringBuilder(st1);
        }
        StringBuilder s= new StringBuilder(s2);
        for(int i=s2.length()-1;i>-1;i--)
        {
            st1=s1.toString();
            st2=s2.toString();
            if((st1.replace(s.toString(),"").equals(""))&&(st2.replace(s.toString(),"").equals("")))return s.toString();
            s.deleteCharAt(i);
        }
        return "";
    }
}