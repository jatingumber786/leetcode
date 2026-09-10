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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode tmp = head;
        List<Integer> arr = new ArrayList<>();
        while(tmp!=null){
            arr.add(tmp.val);
            tmp = tmp.next;
        }
        Collections.sort(arr);
        //int len = arr.size();
        int i=0;
        ListNode temp = head;
        while(temp!=null){
            temp.val = arr.get(i);
            temp = temp.next;
            i++;
        }
        return head;
        
    }
}