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
    public ListNode doubleIt(ListNode head) {
        head= rev(head);//rev it!!
        
        ListNode t= head , prev=null;
        int c=0;
        
        while(t!=null || c>0){
            if(t==null){
                t=new ListNode();
                prev.next = t;
            }
            int s=t.val+t.val ;
            t.val = (s+c)%10;
            c=s>9 ? 1 :0;
            prev=t;
            t=t.next;
        }
        
        head=rev(head);
        
        return head;
    }
    public ListNode rev(ListNode head){
        ListNode t= head;
        ListNode prev= null;

        t=head;
        while(t!=null ){
            ListNode curr = t.next;
            t.next = prev;
            prev=t;
            head=t; 
            t=curr;          
        }
        return head;
    }
}