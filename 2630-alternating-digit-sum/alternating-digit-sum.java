class Solution {
    public int alternateDigitSum(int n) {
        int res = 0;
        int count = 1;
        int rev = 0;
        while(n>0){
            int l = n%10;
            rev = rev*10 + l;
            n/=10;
        }
        while(rev>0){
            if(count%2 !=0){
                res += rev%10;
                count ++;
            }
            else{
                res -= rev%10;
                count++;
            }
            rev/=10;

        }
        return res;
        
    }
}