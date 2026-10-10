class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> d = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(d.containsKey(nums[i])){
                return true;
            }
            else{
                d.put(nums[i],1);
            }
        }
        return false;
    }
}