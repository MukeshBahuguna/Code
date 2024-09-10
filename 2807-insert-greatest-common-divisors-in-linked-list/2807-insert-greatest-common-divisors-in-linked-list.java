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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        if(temp.next==null) return head;
        
        while(temp.next!=null){
            ListNode newT = new ListNode(gcd(temp.val , temp.next.val), temp.next);
            
            temp.next=newT;
            temp=newT.next;
        }
        return head;
    }
    public int gcd(int x , int y){
        if(x<y) return gcd(y,x);
        if(y==0) return x;
        return gcd(y, x%y);
    }
}