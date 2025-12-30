class Solution {
    public String winningPlayer(int x, int y) {
        int m = Math.min(x,y/4);
        if(m%2 == 1){
           return "Alice";
        }
        return "Bob";

        
    }
}