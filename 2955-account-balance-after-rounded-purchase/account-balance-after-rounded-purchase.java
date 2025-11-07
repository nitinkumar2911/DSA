class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int lastDigit = purchaseAmount % 10;
        int rounded;

        if(lastDigit < 5) {
            rounded = purchaseAmount - lastDigit; 
        } else {
            rounded = purchaseAmount + (10 - lastDigit); 
        }

        return 100 - rounded;
        
    }
}