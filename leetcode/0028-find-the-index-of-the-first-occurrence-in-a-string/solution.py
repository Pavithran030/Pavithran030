class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        co=0
        m,n=len(needle),len(haystack)
        if needle not in haystack:return -1
        for i in range(n-m+1):
            if haystack[i:i+m]== needle:
                return i
