class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd =0;
        int pos = 0;
        while(n>0){
            if((n&1)==1){
                if(pos%2==0){
                    even++;
                }else{
                    odd++;
                }

            }
            n>>=1;
            pos++;
        }
        return new int[]{even, odd};

        
    }
}