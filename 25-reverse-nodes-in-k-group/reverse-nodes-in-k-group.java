class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return null;

        // Check if there are at least k nodes remaining in the list
        ListNode node = head;
        int count = 0;
        while (count < k && node != null) {
            node = node.next;
            count++;
        }
        
        // If we have k nodes, proceed with reversal
        if (count == k) {
            ListNode prev = null;
            ListNode next = null;
            ListNode current = head;
            
            // Reverse k nodes
            count = 0;
            while (count < k && current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }
            
            // Recursively reverse the remaining list and connect with the current k-group
            head.next = reverseKGroup(current, k);
            
            // Return the new head after reversal
            return prev;
        }

        // If less than k nodes remain, return head without any changes
        return head;
    }
}
