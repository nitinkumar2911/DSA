class Solution {
    public String reverseVowels(String s) {
        char ch[] =s.toCharArray();
        int l = 0;
        int r = s.length()-1;
        String vowels="AEIOUaeiou";
        while(l<r)
        {
        if(vowels.indexOf(ch[l]) == -1)
        {
            l++;
        }
        else if(vowels.indexOf(ch[r]) == -1)
        {
            r--;
        }
        else
        {
            char temp =ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        }
        return new String(ch);
    }
}