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
    public ListNode middleNode(ListNode head) {
        ListNode sp=head;
        ListNode fp=head;
        while(fp!=null&&fp.next!=null){
            sp=sp.next;
            fp=fp.next.next;
        }
        head=sp;
        return head;
    }
}