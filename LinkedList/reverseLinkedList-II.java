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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current1=dummy;
        ListNode prev1=null;
        for(int i=0;i<left;i++){
            prev1=current1;
            current1=current1.next;
        }
        ListNode current2=current1;
        ListNode prev2=prev1;
        ListNode pointer;
        for(int i=left;i<=right;i++){
            pointer=current2.next;
            current2.next=prev2;
            prev2=current2;
            current2=pointer;
        }
        prev1.next=prev2;
        current1.next=current2;
        return dummy.next;
    }
}
