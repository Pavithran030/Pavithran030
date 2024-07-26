class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        start = 0
        ma= 0
        se= set()

        for end in range(len(s)):
            while s[end] in se:
                se.remove(s[start])
                start += 1
            se.add(s[end])
            ma = max(ma, end - start + 1)

        return ma
