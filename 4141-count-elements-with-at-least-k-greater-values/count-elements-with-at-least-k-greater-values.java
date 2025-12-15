class Solution {
    public int countElements(int[] nums, int k) {
        int n = nums.length;
        if(k==0) return n;
        if(k>n) return 0;
        Arrays.sort(nums);
        int stop = nums[n-k];
        int count = 0;
        for(int num : nums){
            if(num<stop) count ++;
            else break;
        }
        return count;

        
    }
}