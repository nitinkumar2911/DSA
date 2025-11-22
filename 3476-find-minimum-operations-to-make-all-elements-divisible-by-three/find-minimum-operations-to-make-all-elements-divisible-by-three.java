class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for(int num : nums){
            int mod = num%3;
            if(mod !=0){
                res ++;
            }
        }
        return res;
        
    }
}