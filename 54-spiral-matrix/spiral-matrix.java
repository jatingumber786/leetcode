class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int strow =0;
        int erow = m-1;
        int stcol =0;
        int ecol = n-1;
        while(strow<=erow && stcol<=ecol){
            for(int i=stcol ;i<=ecol;i++){
                list.add(matrix[strow][i]);
            }
            for(int i=strow+1;i<=erow;i++){
                list.add(matrix[i][ecol]);
            }
            for(int i=ecol-1;i>=stcol;i--){
                if(strow==erow) break;
                list.add(matrix[erow][i]);
            }
            for(int i=erow-1;i>=strow+1;i--){
                if(stcol==ecol) break;
                list.add(matrix[i][stcol]);
            }
            strow++;
            erow--;
            stcol++;
            ecol--;
        }
        return list;
    }
}