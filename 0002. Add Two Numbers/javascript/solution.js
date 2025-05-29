/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
  let head = null;
  let prev = null;
  let value = 0;

  while (l1 != null || l2 != null || value > 0) {
    value += (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);

    let newNode = new ListNode(value % 10);
    if (prev != null) {
      prev.next = newNode;
    } else {
      head = newNode;
    }
    prev = newNode;

    l1 = (l1 != null ? l1.next : null);
    l2 = (l2 != null ? l2.next : null)
    value = Math.floor(value / 10);
  }
  return head;
};
