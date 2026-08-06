class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int arr[]= new int[256];
        Arrays.fill(arr,-1);
        int left =0;
        int right =0;
        int max=0;
        while(right<n){
            if(arr[s.charAt(right)]>=left){
                left = Math.max(arr[s.charAt(right)]+1,left);
            }
            int len = right-left+1;
            max = Math.max(max,len);
            arr[s.charAt(right)] = right;
            right++;

        }
        return max;
    }
}