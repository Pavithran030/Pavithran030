class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        k=digits
        st=""
        n=[]
        for i in k:
            st=st+str(i)
        ad=str(int(st)+1)
        for i in ad:
            n.append(int(i))
        return n
