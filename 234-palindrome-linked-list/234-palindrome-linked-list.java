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
        ListNode f=head , s=head;
        ListNode prev=null;
        while( f!=null && f.next!=null){
            f=f.next.next;
            ListNode curr= s.next;
            s.next=prev;
            prev=s;
            s=curr;
        }
        
        if(f!=null){
            s=s.next;
        }
        while(prev!=null && s!=null){
            if(prev.val!=s.val) return false;
            s=s.next;
            prev=prev.next;
        }
        return true;
        
    }
}