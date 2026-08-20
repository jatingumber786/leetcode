class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;
        int lmax =height[left];
        int rmax =height[right];
        int ans =0;
        while(left<right){
            if(lmax<rmax){
                left++;
                lmax = Math.max(height[left],lmax);
                ans+=lmax-height[left];
            }else{
                right--;
                rmax = Math.max(height[right],rmax);
                ans+=rmax-height[right];
            }
        }
        return ans;
    }
}