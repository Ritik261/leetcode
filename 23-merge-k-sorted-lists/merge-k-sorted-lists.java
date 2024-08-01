
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }

        return helper(lists, 0, lists.length-1);
    }

    // Divide the List in two parts

    public ListNode helper(ListNode[] lists, int start, int end){
        if (start == end){
            return lists[start];
        }

        int mid = start + (end - start)/2;
        ListNode left = helper(lists, start, mid);
        ListNode right = helper(lists, mid+1 ,end);

        return merge(left, right);
    }

    // Combine the both parts
    
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                current.next = l1;
                l1 = l1.next;
            }
            else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}