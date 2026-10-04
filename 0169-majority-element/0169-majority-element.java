class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<nums.length;i++ )
        if(h.containsKey(nums[i]))
        {
            h.put(nums[i],h.get(nums[i])+1);
            if(h.get(nums[i])>(nums.length/2))
            return nums[i];
        }
        else
        h.put(nums[i],1);
        return nums[0];

    }
}