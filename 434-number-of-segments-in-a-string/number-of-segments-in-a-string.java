class Solution {
    public int countSegments(String s) {
        if(s==null || s.length() == 0) return 0;
        String[] a = s.trim().split("\\s+");
        return a[0].equals("") ? 0 : a.length;
        
    }
}