class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow.next);

        ListNode firstHalf = head;
        ListNode temp = secondHalf;

        // Compare both halves
        while (temp != null) {

            if (firstHalf.val != temp.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

        return prev;
    }
}