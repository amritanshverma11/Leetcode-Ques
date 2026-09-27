class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> a= new HashSet<>();
        for (int i:nums1)
        a.add(i);
        HashSet<Integer> aa= new HashSet<>();
        for (int i:nums2)
        aa.add(i);
        List<List<Integer>> x = new ArrayList<>();
        x.add(new ArrayList<>());
        x.add(new ArrayList<>());
        for(int j:a)
        if(!aa.contains(j))
        x.get(0).add(j);
        for(int j:aa)
        if(!a.contains(j))
        x.get(1).add(j);
        return x;
    }
}