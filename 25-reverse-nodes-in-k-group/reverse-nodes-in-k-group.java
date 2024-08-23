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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        int count = 0;

        // also can

        if(head == null || head.next == null) return head;

        while(count < k && node != null){
            node = node.next;
            count++;
        }

        if(count == k){
            ListNode prev = null;
            ListNode current = head;
            ListNode next = null;
            count = 0;

            while(count < k && current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            head.next = reverseKGroup(current, k);
            return prev;
        }
        return head;
    }
}