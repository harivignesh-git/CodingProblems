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
    public boolean isPalindrome(ListNode head) {
        ListNode h1=head;
        Stack<Integer> stk=new Stack<Integer>();
        while(h1!=null){
            stk.push(h1.val);
            h1=h1.next;
        }
        int flag=0;
        while(head!=null){
            if(head.val==stk.peek()){
                stk.pop();
                head=head.next;
            }else{
                flag=1;
                break;
            }
        }
        if(flag==0){
            return true;
        }else{
            return false;
        } 
    }  
}
