class Solution {
    public boolean checkRecord(String s) {

        int ab=0;
        int le=0;

        for(char c:s.toCharArray()){
            if(c=='A') {
                ab++;
                le=0;
                if(ab>=2) return false;
            }
            else if(c=='L'){
                le++;
                if(le>=3) return false;
            }
            else le=0;

        }
        return true;
    }
}
