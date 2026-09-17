class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int n = nums.length;
        int longe = 1;
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int it : st){
            if(!st.contains(it-1)){ //starting element find karo 
                int count =1;
                int x = it;
            
            while(st.contains(x+1)){ //starting element k next find karo 1 k badd 2 fir 2 fir 4 and then kuch nahi mila toh bhar nikal jaoo while loop se
                count = count+1;
                x = x+1;
            }
            longe = Math.max(longe, count);
        }
        }
        return longe;
        
    }
}