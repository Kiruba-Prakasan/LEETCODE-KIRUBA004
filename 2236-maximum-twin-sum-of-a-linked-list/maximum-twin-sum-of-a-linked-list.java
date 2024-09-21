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
    public int pairSum(ListNode head) {
        int ans=0;
        ListNode fp=head,sp=head;
        while(fp.next!=null&&fp.next.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        sp.next=reverse(sp.next);
        fp=head;
        sp=sp.next;
        int v1=0,v2=0;
        while(sp!=null)
        {
            v1=fp.val;
            v2=sp.val;
            ans=(ans>(v1+v2))?ans:(v1+v2);
            fp=fp.next;
            sp=sp.next;
        }
        return ans;
    }
    private ListNode reverse(ListNode head){
        ListNode nextNode = null;
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            nextNode = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nextNode;
        }
       return prev;
    }
}