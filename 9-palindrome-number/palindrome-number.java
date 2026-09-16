class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false; //as given negatinve value give u false;
        long rev =0;
        int original = x;
        while(x>0){
            int rim = x%10;
            rev = rev*10+rim;
            x= x/10;
        }
        return original==rev;
        
    }
}