class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        int l = 0;
        for(int i = 0; i<n; i++){
            int r = sum - l-nums[i];
            res[i] = Math.abs(l-r);
            l += nums[i];
        }
        return res;
        
    }
}