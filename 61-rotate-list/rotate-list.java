class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int length =1;
        if(head == null) 
        return head;
        //dummyis created to calculate length and to points towards last node
        ListNode dummy = head;
        while(dummy.next!=null)
        {
            dummy = dummy.next;
             length++;
        }
        ListNode current = head;
        k = k % length;
        if(k==0)
        return head;
        //list node is created to find the node that points toward null which break the co
        //connections for example 3
        int steps = length - k;
        for(int i=1;i<steps;i++){
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next =null;
        dummy.next = head;

        return newHead;
    }
}