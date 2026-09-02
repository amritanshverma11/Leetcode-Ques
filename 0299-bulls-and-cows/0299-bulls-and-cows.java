class Solution {
    public String getHint(String s, String g) {
        int x=0,y=0;
        StringBuilder a=new StringBuilder(s);
        for (int i=0;i<g.length();i++)
        if (s.charAt(i)==g.charAt(i))
       { x+=1;
        a.deleteCharAt(a.indexOf(""+g.charAt(i)));
       }
        
        for (int i=0;i<g.length();i++)
        if (s.charAt(i)!=g.charAt(i))
        if (a.indexOf(""+g.charAt(i))!=-1)
       { y+=1;
        a.deleteCharAt(a.indexOf(""+g.charAt(i)));
       }
        return Integer.toString(x)+"A"+Integer.toString(y)+"B";

    }
}