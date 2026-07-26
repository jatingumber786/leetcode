class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        while(m<=h){
            if(nums[m]==0) {
                swap(l,m,nums);
                l++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(m,h,nums);
               // m++;
                h--;
            }
        }  
    }
    public void swap (int l , int r , int[] nums){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}