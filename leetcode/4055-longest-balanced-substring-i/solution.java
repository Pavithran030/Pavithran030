class Solution {
    public int longestBalanced(String s) {

        int size=s.length();
        int re=0;

        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<size;i++){
            mp.clear();
            int k=0;
            for(int j=i;j<size;j++){
                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                int cur=mp.get(s.charAt(j));
                boolean test=true;
                for(int m:mp.values()){
                    if(m!= cur) {
                        test=false;
                        break;
                    }
                }
                
                if(test) re=Math.max(re , j-i+1);
            }
        }
        return re;
    }
}
