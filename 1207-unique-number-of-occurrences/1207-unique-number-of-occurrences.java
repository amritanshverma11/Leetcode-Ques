class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int val:map.values()){
            if(set.contains(val)){
                return false;
            }
            set.add(val);
        }
        return true;
    }
}