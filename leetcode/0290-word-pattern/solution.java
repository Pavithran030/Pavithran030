class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] pat=s.trim().split(" ");

        if(pattern.length() != pat.length) return false;

        Map<Character,String> re=new HashMap<>();
        for(int i=0;i<pattern.length();i++){

            String w=pat[i];

            if(re.containsKey(pattern.charAt(i))){
                if(!re.get(pattern.charAt(i)).equals(w)) return false;
            }
            else{
                if(re.containsValue(w)) return false;
                re.put(pattern.charAt(i),w);
            }

        }
        return true;
    }
}
