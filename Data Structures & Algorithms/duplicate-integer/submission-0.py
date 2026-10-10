class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        for i in range(len(nums)-1):
            for j in (i+1,len(nums)-1):
                if nums[j]==nums[i]:
                    return True
                else: 
                    continue
        return False

        