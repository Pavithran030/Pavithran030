class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        re= 0
        te = x

        while te != 0:
            digit = te% 10
            re= re * 10 + digit
            te //= 10

        return re == x
