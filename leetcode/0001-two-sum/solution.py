class Solution:
    def twoSum(self,nums,targets):
        num_to_index = {}
        for i, num in enumerate(nums):
            complement = targets - num
            if complement in num_to_index:
                return [num_to_index[complement], i]
            num_to_index[num] = i
        return []
