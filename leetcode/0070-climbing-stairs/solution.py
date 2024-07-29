class Solution:
    def climbStairs(self, n: int) -> int:
        if n<=3:
            return n
        else:
            x,y,temp=0,1,0
            for i in range(n):
                temp=x+y
                x=y
                y=temp
            return temp

