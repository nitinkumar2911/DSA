class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            int max = 0;
            for(int j = 0; j<accounts[i].length; j++){
                max +=accounts[i][j];
                sum = Math.max(sum, max);
            }
        }
        return sum;
        
    }
}