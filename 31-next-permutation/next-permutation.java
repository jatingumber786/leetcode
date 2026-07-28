class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot =-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
            pivot = i;
            break;
            }
        }
        if(pivot==-1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[pivot]<nums[i]){
                swap(pivot ,i,nums);
                break;
            }
        }
        reverse(pivot+1,n-1,nums);
    }
    public void swap(int a , int b,int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b]= temp;
    }
    public void reverse(int left, int right, int[] nums){
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}