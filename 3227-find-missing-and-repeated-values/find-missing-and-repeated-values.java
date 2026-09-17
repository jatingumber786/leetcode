class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> set = new HashSet<>();
        int ans[] = new int[2];
        int n = grid[0].length;
        int sum =0;
        int sq = n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    ans[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                    sum+=grid[i][j];
                }
            }
        }
        int asum = sq*(sq+1)/2;
        ans[1] = asum - sum;
        return ans; 
    }
}