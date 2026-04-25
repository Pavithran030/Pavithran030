class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> store = new HashMap<>();

        for(String s : strs){

            int[] count=new int[26];

            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }

            String word=Arrays.toString(count);

            if(!store.containsKey(word)){
                store.put(word,new ArrayList<>());
            }
            store.get(word).add(s);
        }

        return new ArrayList<>(store.values());
    }
}
