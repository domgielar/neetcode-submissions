class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int i = 0;
        int left = 1;
        while(i<nums.length){
            int right = nums.length-1;
            int prod=1;
            while(right>i){
                prod*=nums[right];
                right--;
            }
            if(i>0){
                left*=nums[i-1];
            }
            prod*=left;
            output[i] = prod;
            i++;
        }
        return output;
        }
}  
