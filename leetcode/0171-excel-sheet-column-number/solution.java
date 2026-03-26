class Solution {
    public int titleToNumber(String columnTitle) {

        int size=columnTitle.length();
        int re=0;
        for(int i=0;i<size;i++){
            char c=columnTitle.charAt(i);
            int val = c - 'A' + 1;
            re=re * 26 + val;
        }

        return re;
        
    }
}
