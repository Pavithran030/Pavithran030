class Solution {
    public int furthestDistanceFromOrigin(String moves) {

        int countr=0 ,countl=0 ,countd=0;

        for(char c:moves.toCharArray()){
            if(c=='L') countl++;
            else if(c=='R') countr++;
            else countd++;
        }
        return Math.abs(countl-countr)+countd;
    }
}
