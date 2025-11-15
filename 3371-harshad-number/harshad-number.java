class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int s = 0;
        while(temp>0){
            int l = temp%10;
            s +=l;
            temp/=10;

        }
        if(x%s==0){
            return s;
        }else{
            return -1;
        }
        
    }
}