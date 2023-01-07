class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode zero=head;
        ListNode iterator=head.next;
        while(iterator!=null){
            if(iterator.val!=0){
                zero.val+=iterator.val;
            }else{
                if(iterator.next==null){
                    zero.next=null;
                }else{
                    zero.next=iterator;
                }
                zero=iterator;
            }
            iterator=iterator.next;
        }
        return head;
    }
}
