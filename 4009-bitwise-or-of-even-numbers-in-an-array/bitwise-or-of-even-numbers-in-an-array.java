class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i<n; i++){
            if(nums[i]%2==0){
                res = res|nums[i];

            }
        }
        return res;
        
    }
}