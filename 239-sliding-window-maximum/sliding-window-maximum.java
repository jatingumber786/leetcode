class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        dq.addLast(0);
        for(int i=1;i<k;i++)
        {
            while(!dq.isEmpty() && nums[i]>= nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        result.add(nums[dq.getFirst()]);
        //for all window except first
        for(int i=k;i<n;i++)
        {
            if(i-dq.getFirst()>=k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[i]>= nums[dq.getLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
            result.add(nums[dq.getFirst()]);
        }
        int [] resArr = new int[result.size()];
        for(int i=0;i<result.size();i++)
        {
            resArr[i] = result.get(i);
        }
        return resArr;
        
    }
}