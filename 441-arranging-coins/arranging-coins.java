class Solution {
    public int arrangeCoins(int n) {
        int t = n;
        int c = 0;
        for(int i = 1; i<=n; i++){
             t -=i;
             c++;
             if(t<0){
                return c-1;
             }

        }
        return 1;
        
    }
}