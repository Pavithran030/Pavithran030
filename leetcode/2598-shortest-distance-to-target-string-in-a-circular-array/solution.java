class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int size = words.length;

        int mindis=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(words[i].equals(target)){
                int dist1 = Math.abs(i-startIndex);
                int dist2 = Math.min(dist1,size - dist1);

                mindis=Math.min(mindis,dist2);
            }
        }

        return mindis==Integer.MAX_VALUE ? -1 : mindis;
    }
}
