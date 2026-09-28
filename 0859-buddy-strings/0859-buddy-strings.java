class Solution {
    public boolean buddyStrings(String s, String g) {
        if(s.length()!=g.length()) return false ;
        if (s.equals(g))
        {
            HashSet<Character>h= new HashSet<>();
            for (char c:s.toCharArray())
            h.add(c);
            return h.size()<g.length();
        }
        int i=0,j=s.length()-1;
        while(i<j&&(s.charAt(i)==g.charAt(i)))i++;
        while(j>=0&&(s.charAt(j)==g.charAt(j)))j--;
        if(i<j)
        {
            char c[]=s.toCharArray();
            char t=c[i];
            c[i]=c[j];
            c[j]=t;
            s= new String (c);
        }
        return s.equals(g);
    }
}