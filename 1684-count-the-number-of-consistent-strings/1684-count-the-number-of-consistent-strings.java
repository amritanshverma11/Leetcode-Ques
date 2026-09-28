class Solution {
    public int countConsistentStrings(String a, String[] w) {
        HashSet <Character> h= new HashSet<>();
        for(char c:a.toCharArray())
        h.add(c);
        int f=0;
        for (String s:w)
        {
            boolean b= true;
            for(char c:s.toCharArray())
            if(!(h.contains(c)))
            {
                b=false;
                break;
            }
            if(b)f++;
        }
        return f;
    }
}