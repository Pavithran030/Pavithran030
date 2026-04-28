class Solution {
    public int minOperations(int[][] grid, int x) {

        int m=grid.length;
        int n=grid[0].length;

        int[] refac=new int[m*n];
        int ind=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                refac[ind++]=grid[i][j];
            }
        }
        Arrays.sort(refac);
        int mid=Math.abs((m*n)/2);

        int median = refac[mid];
        int re=0;

        for(int i:refac){
            if(i%x != median%x) return -1;
            re+=Math.abs(median-i)/x;
        }
        return re;
    }
}
