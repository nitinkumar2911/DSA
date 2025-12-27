class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int r1 = rob( nums,  0,  n-2);
        int r2 = rob( nums,  1,  n-1);
        return Math.max(r1, r2);
        
    }
    private int rob(int[] nums, int s , int e ){
        int l = e - s +1;
        int[] dp = new int[l];
        dp[0] = nums[s];
        if(l>1){
            dp[1] =  Math.max( nums[s], nums[s +1]);
        }
        for(int i =2; i<l; i++){
           dp[i] = Math.max(nums[s + i] + dp[i - 2], dp[i - 1]);

        }
        return dp[l -1];
    }
}