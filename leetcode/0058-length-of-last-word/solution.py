class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        k=list(map(str,s.strip().split()))
        m=len(k)
        return len(k[m-1])

