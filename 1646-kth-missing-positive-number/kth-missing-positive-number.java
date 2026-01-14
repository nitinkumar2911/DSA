class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a = 1;
        int i = 0;
        while(k > 0){
            if(i < arr.length && arr[i] == a){
                i++;
            }else{
                k--;
            }
            a++;
        }
        return a -1;
    }
}