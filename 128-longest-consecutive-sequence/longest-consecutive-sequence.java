class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longe = 1;
        int n = nums.length;
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int count = 1;
                int x = it;
            while(set.contains(x+1)){
                count++;
                x++;
            }
            longe = Math.max(longe,count);
        }
        }
        return longe;
        
    }
}