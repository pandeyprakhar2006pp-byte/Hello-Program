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
    public ListNode rotateRight(ListNode head, int k) {
        
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length and last node
        ListNode tail = head;
        int length = 1;

        while (tail.next != null) {
            length++;
            tail = tail.next;
        }

        k = k % length;

        if (k == 0) {
            return head;
        }

        // Make circular list
        tail.next = head;

        int steps = length - k;
        ListNode temp = head;

        for (int i = 1; i < steps; i++) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
        
    }
}