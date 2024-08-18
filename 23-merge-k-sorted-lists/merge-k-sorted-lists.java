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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0 ){
            return null;
        }
        return helper(lists, 0, lists.length - 1);
    }

    public ListNode helper(ListNode[] lists, int start, int end){
        if (start == end ) return lists[start];

        int mid = start + (end - start)/2;
        ListNode left = helper(lists, start, mid);
        ListNode right = helper(lists, mid+1, end);

        return merge(left , right);
    }

    public ListNode merge(ListNode left , ListNode right){
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(left != null && right != null){
            if(left.val > right.val){
                current.next = right;
                right = right.next;
            }
            else{
                current.next = left;
                left = left.next;
            }
            current = current.next;
        }
        current.next = (left != null) ? left : right;
        return dummy.next;
    }
}