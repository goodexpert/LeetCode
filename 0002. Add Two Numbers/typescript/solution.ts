/**
 * Definition for singly-linked list.
 * class ListNode {
 *     val: number
 *     next: ListNode | null
 *     constructor(val?: number, next?: ListNode | null) {
 *         this.val = (val===undefined ? 0 : val)
 *         this.next = (next===undefined ? null : next)
 *     }
 * }
 */

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
  let head: ListNode | null = null;
  let prev: ListNode | null = null;
  let value = 0;

  while (l1 != null || l2 != null || value > 0) {
    value += (l1?.val ?? 0) + (l2?.val ?? 0);

    let newNode = new ListNode(value % 10);
    if (prev != null) {
      prev.next = newNode;
    } else {
      head = newNode;
    }
    prev = newNode;

    l1 = l1?.next ?? null;
    l2 = l2?.next ?? null;
    value = Math.floor(value / 10);
  }
  return head;
};
