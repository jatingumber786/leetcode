class Solution {
    public String reverseWords(String s) {
        String word = "";
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ' ' && !word.equals("")){
                ans = word+ " " + ans;
                word = "";
            }else if(s.charAt(i) == ' '){
                continue;
            }else{
                word += s.charAt(i);
            }
        }
        if(!word.equals(""))
        ans = word+ " "+ ans;
        return ans.trim();
    }
}