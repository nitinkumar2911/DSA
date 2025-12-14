class Solution {
    public boolean squareIsWhite(String coordinates) {
        char col = coordinates.charAt(0);
        char row = coordinates.charAt(1);
        int column = col - 'a' +1;
        int rows = row - '0';
        return (rows + column)%2 ==1;
        
    }
}