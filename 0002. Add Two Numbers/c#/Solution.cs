/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode prev = null;
        int value = 0;

        while (l1 != null || l2 != null || value > 0) {
            value += (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

            var newNode = new ListNode(value % 10, null);
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
