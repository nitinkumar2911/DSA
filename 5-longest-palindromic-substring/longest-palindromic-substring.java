class Solution {
    public String longestPalindrome(String s) {
        int max =0, l =0, r = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(isPalindrome(s,  i, j)){
                    int curr = j-i +1;
                    if(max<curr){
                        max = curr;
                        l = i;
                        r = j;
                    }

                }
            }
        }
        return s.substring(l, r+1);
        
    }
public static boolean isPalindrome(String s , int i, int j){
    while(i<j){
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;

}
}