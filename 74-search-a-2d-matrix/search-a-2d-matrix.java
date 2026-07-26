class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length; 
        int n = matrix[0].length;
        int low = 0;
        int high = m-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid][0]<=target && target <=matrix[mid][n-1]) return searchinrow(matrix , target , mid);
            else if(matrix[mid][n-1]<= target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public boolean searchinrow(int[][]matrix , int target ,int midrow){
        int m = matrix.length; 
        int n = matrix[0].length;
        int left =0;
        int high = n-1;
        while(left<=high){
            int mid = (left+high)/2;
            if(target==matrix[midrow][mid]) return true;
            else if(target>= matrix[midrow][mid]) left = mid+1;
            else high = mid-1;
        }
        return false;

    }
}