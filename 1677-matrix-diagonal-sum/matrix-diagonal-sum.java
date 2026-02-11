class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += mat[i][i];
            sum += mat[i][n-i-1];
            if(i == n-i-1){
                sum -= mat[i][i];
            }
        }
        return sum;
        
    }
    
}