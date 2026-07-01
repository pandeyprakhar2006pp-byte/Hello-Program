public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = getLength(headA);
        int lenB = getLength(headB);

        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }

        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }

        while (headA != null && headB != null) {

            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }

    public int getLength(ListNode head) {

        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }
}