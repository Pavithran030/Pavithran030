class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        co=0
        for i in range(1,len(nums)):
            if nums[i]!=nums[co]:
                co+=1
                nums[co]=nums[i]
        return co+1

