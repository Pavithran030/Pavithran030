class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char i:moves.toCharArray()){
            if(i=='R') x+=1;
            else if(i=='L') x-=1;
            else if(i=='U') y+=1;
            else y-=1;
        }

        if(x==0 && y==0) return true;
        else return false;
    }
}
