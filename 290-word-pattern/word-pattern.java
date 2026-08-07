class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;
        HashMap<Character,String> map = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            boolean containskeyvariable = map.containsKey(ch);
            if(map.containsValue(arr[i]) && !containskeyvariable) return false;
            if(containskeyvariable && !map.get(ch).equals(arr[i])) return false;
            else map.put(ch,arr[i]);
        }
        return true;
        
    }
}