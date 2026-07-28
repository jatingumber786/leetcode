class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxarea = 0;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right - left;
            int currentwater = h*w;
            maxarea = Math.max(currentwater,maxarea);
            if(height[left]<height[right]) left++;
            else right--;
            
        }
        return maxarea;
        
    }
}