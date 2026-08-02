class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindrome
        if (x < 0) return false;

        long rev = 0;          // Reversed number
        int original = x;     // Store original value

        while (x > 0) {
            rev = rev * 10 + x % 10;  // Build reverse
            x = x / 10;               // Remove last digit
        }

        // Compare reversed with original
        return rev == original;
    }
}