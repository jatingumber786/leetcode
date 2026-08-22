class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        //Char ch[] = s.toCharArray();
        while(left<right){
            char t = s[left];
            s[left]=s[right];
            s[right] = t;
            left++;
            right--;
        }
        
    }
}