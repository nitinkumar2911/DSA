class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
        int diffBit = xor &(-xor);
        int a = 0, b = 0;
        for(int n : nums){
            if((n &diffBit) == 0){
                a ^=n;

            } else{
                b ^= n;
            }           
        }
        return new int[]{a,b};
        
        
    }
}