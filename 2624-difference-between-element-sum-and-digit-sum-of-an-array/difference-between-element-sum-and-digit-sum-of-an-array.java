class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int d = 0;
        for(int i = 0; i<n; i++){
            int s = nums[i];
            sum += nums[i];
            while(s>0){
                int l = s%10;
                d += l;
                s/=10;


            }
            
        }
        return Math.abs(sum -d);
        
    }
}