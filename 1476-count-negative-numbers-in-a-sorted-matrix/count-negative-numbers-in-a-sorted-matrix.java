class Solution {
    public int countNegatives(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int res  = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                if(grid[i][j]<0){
                    res++;

                }
            }
        }
        return res;
        
    }
}