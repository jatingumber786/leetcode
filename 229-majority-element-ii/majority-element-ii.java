class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int e1 =-1,e2=-1;
        int cnt=0,cnt2 =0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(e1 == nums[i]){
                cnt++;
            }else if(e2==nums[i]){
                cnt2++;
            }else if(cnt==0 ){
                e1 = nums[i];
                cnt = 1;
            }else if(cnt2 == 0 ){
                e2= nums[i];
                cnt2=1;
            }else{
                cnt--;
                cnt2--;
            }
        }
        int count= 0;
        int count2 =0;
        for(int i=0;i<n;i++){

            if(e1==nums[i]) count++;
            else if(e2==nums[i]) count2++;
        }
        if(count>(n/3)) list.add(e1);
        if(count2>(n/3)) list.add(e2);
        return list;
    }
}