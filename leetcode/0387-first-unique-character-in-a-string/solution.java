class Solution {
    public int firstUniqChar(String s) {

        int[] ar=new int[26];
        // Set<Character> re=new HashSet<>();

        for(int i=0;i<s.length();i++){
            ar[s.charAt(i)-'a']++; 
        }

        for(int j=0;j<s.length();j++){
            if(ar[s.charAt(j)-'a']==1) return j;
        }
        return -1;
        
    }
}
