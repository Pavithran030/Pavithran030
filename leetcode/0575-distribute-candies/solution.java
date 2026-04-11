class Solution {
    public int distributeCandies(int[] candyType) {
        
        // int size=;
        Set<Integer> uni=new HashSet<>();
        for(int i:candyType){
            uni.add(i);
        }

        return Math.min(uni.size(),candyType.length/2);
        
    }
}
