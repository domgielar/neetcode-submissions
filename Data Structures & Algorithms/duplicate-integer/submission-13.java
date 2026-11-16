class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> t = new HashSet<>();
        for(Integer n: nums){
            if(t.contains(n)){
                return true;
            }
            else{
                t.add(n);
            }
    }
    return false;
}
}