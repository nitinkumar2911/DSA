class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int temp = n;
        while(temp>0){
            int last = temp%10;
            sum +=last;
            pro *=last;
            temp/=10;

        }
        int res = sum + pro;
        return n%res ==0;
        
    }
}