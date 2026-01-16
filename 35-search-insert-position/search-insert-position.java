class Solution {
    public int searchInsert(int[] nums, int target) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i : nums){
            a1.add(i);
        }
        int i = Collections.binarySearch(a1,target);
        if(i>=0){
            return i;
        }
        return Math.abs(i) -1;
    }
}