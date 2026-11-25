class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) 
    {
        ArrayList<Boolean> l =new ArrayList<>();
        int m=c[0];
        for(int i:c)
        if(i>m)m=i;
        for(int i:c)
        if((i+e)>=m)l.add(true);
        else l.add(false);
        return l;
    }
}