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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = null;
            }
            else{
                current = current.next;
            }

        } 
        return head;
    }
}