class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        int t = n;
        int temp = n;
        while(t>0){
            int l =  t%10;
            pro = pro*l;
            t/=10;
        }
        while(temp>0){
            int l = temp%10;
            sum = sum +l;
            temp/=10;
        }
        return pro-sum;
        
    }
}