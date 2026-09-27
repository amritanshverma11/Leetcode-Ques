class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        if (h.containsKey(arr[i]))
          h.put(arr[i], h.get(arr[i]) + 1);
        else 
        h.put(arr[i],1);
        HashSet<Integer> s = new HashSet<>(h.values());
        return s.size()==h.size();

    }
}