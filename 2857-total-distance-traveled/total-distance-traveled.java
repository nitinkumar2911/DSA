class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int transfers = Math.min((mainTank - 1) / 4, additionalTank);
        int usableLitres = mainTank + transfers;
        return usableLitres * 10;
        
        
    }
}