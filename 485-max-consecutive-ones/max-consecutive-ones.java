class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0;
        int currC = 0;
    for(int num : nums){
    if(num == 1){
        currC ++;
        maxC = Math.max(maxC, currC);

    } else{
        currC = 0;
    }
    

    }
    return maxC;

        
    }
}