class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Special case: only one node
        if (head.next == null) {
            return null;
        }

        // Step 1: Find size of linked list
        int size = 0;
        ListNode curr = head;

        while (curr != null) {
            curr = curr.next;
            size++;
        }

        // Step 2: Remove head node
        if (n == size) {
            return head.next;
        }

        // Step 3: Traverse to (size - n)th node
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;

        while (i < indexToSearch) {
            prev = prev.next;
            i++;
        }

        // Step 4: Delete node
        prev.next = prev.next.next;

        return head;
    }
}