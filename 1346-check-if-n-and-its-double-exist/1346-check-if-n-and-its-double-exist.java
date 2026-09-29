class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer>h = new HashSet<>();
        for(int i:arr)
        if(h.contains(i*2))
        return true;
        else h.add(i);

        for (int i:h)
         if(h.contains(i*2)&&i!=0)
        return true;
        return false;
    }
}