class Solution {
    public boolean canPartitionGrid(int[][] grid) {

        long totalsum=0;
        long row=0;
        long column=0;

        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                totalsum+=grid[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                row+=grid[i][j];
            }

            if(row ==(totalsum-row)) return true;
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                column+=grid[j][i];
            }

            if(column==(totalsum-column)) return true;
        }

        return false;
    }
}
