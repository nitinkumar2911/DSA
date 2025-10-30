class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int res = 0;
        while(temp>0){
            int l = temp%10;
            res = res*10 +l;
            temp/=10;
        }
        int ans = 0;
        while(res>0){
            int d = res%10;
            ans = ans*10 +d;
            res/=10;
        }
        if(ans == num){
            return true;
        }else{
            return false;
        }
        
        
    }
}