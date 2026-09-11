class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = head;
        int length = 1;
        if(head==null || head.next==null) return head;
        while(dummy.next!=null){
            length++;
            dummy = dummy.next;
        }
         k = k%length; 
        if(k==0) return head;
        int steps = length-k;
        ListNode current = head;
        for(int i=1;i<steps;i++){
            current = current.next;
        }
        ListNode newHead = current.next;
        current.next = null;
        dummy.next = head;
        return newHead;
    }
    
}