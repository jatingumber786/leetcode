/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode tmp = head;
        ListNode prev = null;
        while(tmp!=null){
            ListNode front = tmp.next;
            tmp.next = prev;
            prev = tmp;
            tmp = front;
        }
        return prev;

        
    }
}