class Solution {
    public int bitwiseComplement(int n) {

        if(n==0) return 1;

        int temp=n;
        int result=0;
        int flip=0;
        int power=1;

        while(temp>0){
            int digit=temp % 2;
            flip=(digit==0)?1:0;
            result += flip * power;

            temp/=2;
            power*=2;
        }

        return result;
        
    }
}
