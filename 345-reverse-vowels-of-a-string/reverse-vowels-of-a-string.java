class Solution {
    public String reverseVowels(String s) {
        char arr[] =  s.toCharArray();
        int n = s.length();
        int left =0;
        int right = n-1;
        while(left<=right){
            while(left<right && !vowel(arr[left])) left++;
            while(left<right && !vowel(arr[right])) right--;
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
    private boolean vowel(char ch){
        return ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i'||ch=='A' || ch=='O' || ch=='E' || ch=='I' || ch=='U';
    }
}