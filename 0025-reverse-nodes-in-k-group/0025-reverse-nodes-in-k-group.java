class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null) {

            ListNode kthNode = getKthNode(temp, k);

            if (kthNode == null) {

                if (prevLast != null) {
                    prevLast.next = temp;
                }

                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (temp == head) {
                head = kthNode;
            } else {
                prevLast.next = kthNode;
            }

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

    public ListNode getKthNode(ListNode temp, int k) {

        k--;

        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
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