class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        int left =0, right =0, max =0; 
        Arrays.fill(hash,-1);
        while(right<s.length())
        {
            if(hash[s.charAt(right)]>=left){
                left = Math.max(left,hash[s.charAt(right)]+1);
            }
            int length = right - left +1;
            max = Math.max(length,max);
            hash[s.charAt(right)] = right;
            right++;
        }
        return max;
        
    }
}