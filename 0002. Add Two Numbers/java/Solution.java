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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode prev = null;
        int value = 0;

        while (l1 != null || l2 != null || value > 0) {
            value += (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

            ListNode newNode = new ListNode(value % 10);
            if (prev != null) {
                prev.next = newNode;
            } else {
                head = newNode;
            }
            prev = newNode;

            l1 = (l1 != null ? l1.next : null);
            l2 = (l2 != null ? l2.next : null);
            value /= 10;
        }
        return head;
    }
}
