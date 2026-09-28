class Solution {
    public int numJewelsInStones(String j, String s) {
        HashSet <Character>h= new HashSet<>();
        for(char c:j.toCharArray())
        h.add(c);
        int f=0;
        for(char c:s.toCharArray())
        if(h.contains(c))f++;
        return f;
    }
}