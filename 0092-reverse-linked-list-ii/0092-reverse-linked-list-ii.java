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
        ListNode dummy= new ListNode(-1 , head);
        ListNode t= dummy;
        int c=left ;
        
        ListNode prev=null;
        while(t!=null){
            ListNode curr = t.next;
            prev=t;
            c-=1;
    
            if(c==0 ){
                ListNode p= prev;
                while(t!=null && c>=(left-right-1)){
                    ListNode cNode = t.next;
                    t.next=p;
                    p=t;
                    t=cNode;
                    c-=1;
                }
                curr.next=t;
                prev.next=p;
                break;
            }
            t=curr;
        }
        return dummy.next;
    }
}