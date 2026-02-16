class Solution {
    public int reverseBits(int n) {
        int re=0;

        for(int i=0;i<32;i++){
            re <<= 1;
            re |= (n&1);
            n >>= 1;
        }
        return re;
    }
}
