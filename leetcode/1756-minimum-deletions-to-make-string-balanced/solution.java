class Solution {
    public int minimumDeletions(String s) {

        int res=0 , bcount=0;

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='b') bcount++;
            else{
                res = Math.min (res+1,bcount);
            }
        }
        return res;
        
    }
}
