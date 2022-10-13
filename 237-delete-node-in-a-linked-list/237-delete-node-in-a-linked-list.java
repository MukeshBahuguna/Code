/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode t= node;
        ListNode prev=null;
        while(t!=null && t.next!=null){
            t.val=t.next.val;
            prev=t;
            t=t.next;
        }
        prev.next=null;
        
    }
}