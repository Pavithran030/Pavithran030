class Solution {
    public String toLowerCase(String s) {
        String re="";
        for(char ch:s.toCharArray()){
            if(ch>='A' && ch<='Z')
                re+= (char) (ch+32);
            else re+=ch;
        }
        return re;
        // return s.toLowerCase();
        
    }
}
