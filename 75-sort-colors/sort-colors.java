class Solution {
    public void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(0==nums[i]) c0++;
            else if(1==nums[i]) c1++;
            else c2++;
        }
        for(int i=0;i<n;i++){
            if(i>=0 && i<c0) nums[i] =0;
            else if(i>=c0 && i<(c0+c1)) nums[i] =1;
            else nums[i] =2;
        }
        
    }
}