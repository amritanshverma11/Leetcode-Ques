class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;

        for(int x : nums) {
            int comp = k - x;

            if(map.getOrDefault(comp, 0) > 0) {
                ans++;
                map.put(comp, map.get(comp) - 1);
            }
            else {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        return ans;
    }
}