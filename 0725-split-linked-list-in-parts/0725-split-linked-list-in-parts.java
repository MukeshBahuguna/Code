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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n=0;
        ListNode t = head;
        while(t!=null){
            n+=1;
            t=t.next;
        }
        
        int rem = n%k;
        int q=n/k;
        
        t = head;
        int c=1;
        int i=0;
        ListNode[] ans = new ListNode[k];
        
        if(q==0){
            while(t!=null){
                ListNode curr =t.next;
                t.next=null;
                ans[i++]=t;
                t=curr;
            }
        }
        else{
           while(t!=null){
            ListNode curr =t.next;
            if(c==q){
                if(rem>0){
                    t=t.next;
                    curr=t.next;
                    rem-=1;
                }
                t.next=null;
                ans[i]=head;
                head=curr;
                i+=1;
                c=0;

            }
            c+=1;
            t=curr;
            } 
        }
        
        
        return ans;
            
    }
}