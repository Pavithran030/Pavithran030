class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n==0:
            return nums1
        elif m==0:
            nums1.clear()
            for i in nums2:
                nums1.append(i)
            return nums1
        else:
            k=0
            for i in range(n):
                
                nums1[-(i+1)]=nums2[i]
    
            return nums1.sort()
        
