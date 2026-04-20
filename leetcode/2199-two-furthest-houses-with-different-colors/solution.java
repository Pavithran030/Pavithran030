class Solution {
    public int maxDistance(int[] colors) {

        int res=0;
        int last = colors.length;

        for(int i=0;i<last;i++){
            if(colors[i]!=colors[0]) res=Math.max(res,i);
        }

        for(int j=last-1 ;j>=0 ;j--){
            if(colors[j]!=colors[last-1]) res=Math.max(res,last-1-j);
        }
        return res;
    }
}
