class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
    private void  reverse(int[] a,int st, int e){
        while(st<=e){
            int temp = a[st];
            a[st] = a[e];
            a[e] = temp;
            st++;
            e--;
        }
    }
}