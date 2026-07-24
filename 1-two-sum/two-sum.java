class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> hp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sec = target - nums[i];
            if(hp.containsKey(sec)){
                return new int[] {hp.get(sec),i};
            }else{
                hp.put(nums[i],i);
            }
        }
        return new int[]{};
        
        
    }
}