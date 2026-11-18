class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> n = new HashSet<>();
        for(int x :nums){
            n.add(x);
        }
        int longest = 0;
        for(int i = 0;i<nums.length;i++){
            if(!n.contains(nums[i]-1)){
                int length = 0;
                while(n.contains(nums[i]+length)){
                    length+=1;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
        
    }
}
