class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int n2 = t.length();
        int arr[] = new int[26];
        if(n!=n2) return false;
        for(int i=0;i<n;i++){
           arr[s.charAt(i)-'a']++;
           arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0) return false;
        }
        return true;
    }
}