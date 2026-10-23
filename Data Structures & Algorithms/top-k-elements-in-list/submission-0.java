class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> n = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            n.put(nums[i], n.getOrDefault(nums[i],0)+1);
        }
        List<Integer> keys = new ArrayList<>(n.keySet());
        keys.sort((a,b)->n.get(b)-n.get(a));
        for(int j = 0;j<ans.length;j++){
            ans[j] =keys.get(j); 
        }
        return ans;
        
    }
}
