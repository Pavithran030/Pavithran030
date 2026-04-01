class Solution {
    public String toHex(int num) {

        if(num==0) return "0";
        
        char[] hex= "0123456789abcdef".toCharArray();
        StringBuffer re=new StringBuffer();

        while(num!=0){
            int digit = num&15;
            re.append(hex[digit]);
            num>>>=4;
        }
        return re.reverse().toString();
    }
}
