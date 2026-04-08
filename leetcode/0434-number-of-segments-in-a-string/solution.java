class Solution {
    public int countSegments(String s) {
        if(s.isBlank()) return 0;
        String[] re=s.trim().split("\\s+");
        int count =re.length;
        return count;
    }
}
