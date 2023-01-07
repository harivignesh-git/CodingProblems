class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr_node=head;
        ListNode prev_node=null;
        
        while(curr_node!=null){
            ListNode next_node=curr_node.next;
            curr_node.next=prev_node;
            prev_node=curr_node;
            curr_node=next_node;
        }
        head=prev_node;
        return head; 
    }
}
