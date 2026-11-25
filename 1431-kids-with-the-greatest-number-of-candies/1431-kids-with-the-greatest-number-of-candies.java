class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) 
    {
        ArrayList<Boolean> l =new ArrayList<>();
        int m=Integer.MIN_VALUE;
        for(int i:c)
        m=Math.max(i,m);
        for(int i:c)
        if((i+e)>=m)l.add(true);
        else l.add(false);
        return l;
    }
}