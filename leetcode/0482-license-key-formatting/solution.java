class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuffer fin=new StringBuffer();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='-'){
                continue;
            }
            if(count==k){
                fin.append("-");
                count=0;
            }
            fin.append(Character.toUpperCase(c));
            count++;

        }
        return fin.reverse().toString();
        
    }
}
