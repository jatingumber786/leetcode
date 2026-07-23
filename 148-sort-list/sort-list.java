class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        List<Integer> arr  = new ArrayList<>();
        //temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp= temp.next;
        }
        Collections.sort(arr);
        int i=0;
        temp = head;
        while(temp!=null){
            temp.val= arr.get(i);
            temp = temp.next;
            i++;
        }
        return head;
    }
}