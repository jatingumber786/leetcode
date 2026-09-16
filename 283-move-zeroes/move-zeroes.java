class Solution {
    public void moveZeroes(int[] nums) {
        int right=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,right);
                right++;
            }        
        }
    }
    private void swap(int[]nums,int i,int j){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] = temp;
            }
}