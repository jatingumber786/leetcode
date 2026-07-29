class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int []> merged = new ArrayList<>();
        int [] newinterval = intervals[0];
        for(int i =1;i<intervals.length;i++){
            if(intervals[i][0]<=newinterval[1]){
                newinterval[1] = Math.max(newinterval[1],intervals[i][1]);
            }else{
                merged.add(newinterval);
                newinterval = intervals[i];
            }
        }
        merged.add(newinterval);
        return merged.toArray(new int[merged.size()][]);
    }
}