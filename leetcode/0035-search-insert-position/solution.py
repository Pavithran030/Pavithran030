class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target in nums:
            # for i,n in enumerate(nums):
            #     if n==target:
            #         return i
            return nums.index(target)
        else:
            nums.append(target)
            nums.sort()
            return nums.index(target)
                    
