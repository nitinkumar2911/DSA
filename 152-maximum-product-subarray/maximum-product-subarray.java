class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        int[] maxDP = new int[n];
        int[] minDP = new int[n];
        maxDP[0] = nums[0];
        minDP[0] = nums[0];
        int ans = nums[0];
        for(int i = 1; i<n; i++){
            int c = nums[i];
            int proMax = maxDP[i-1]*c;
            int proMin = minDP[i-1]*c;
            maxDP[i] = Math.max(c,Math.max(proMax, proMin));
            minDP[i] = Math.min(c, Math.min(proMax, proMin));
            ans = Math.max(ans, maxDP[i]);
        }
        return ans;
        
    }
}