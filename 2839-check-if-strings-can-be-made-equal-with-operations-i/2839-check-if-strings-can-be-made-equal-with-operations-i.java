class Solution {
    public boolean canBeEqual(String s1, String s2)
    {
        if (s1.equals(s2))
        return true ;

        for(int i=0;i<4;i++)
            if((s1.indexOf(s2.charAt(i))==-1)||(s2.indexOf(s1.charAt(i))==-1))
            return false ;
        if(s1.equals(""+s2.charAt(2)+s2.charAt(1)+s2.charAt(0)+s2.charAt(3)))
        return true;
        else if(s1.equals(""+s2.charAt(0)+s2.charAt(3)+s2.charAt(2)+s2.charAt(1)))
        return true;
        else if(s1.equals(""+s2.charAt(2)+s2.charAt(3)+s2.charAt(0)+s2.charAt(1)))
        return true;
        return false ;
        

    }
}