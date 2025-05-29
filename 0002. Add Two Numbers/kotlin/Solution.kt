/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var head: ListNode? = null
        var prev: ListNode? = null
        var value = 0
        
        var p1 = l1
        var p2 = l2
        while (p1 != null || p2 != null || value > 0) {
            value += (p1?.`val` ?: 0) + (p2?.`val` ?: 0)
            
            var newNode = ListNode(value % 10)
            if (prev != null) {
                prev.next = newNode
            } else {
                head = newNode
            }
            prev = newNode

            p1 = p1?.next
            p2 = p2?.next
            value /= 10
        }
        return head
    }
}
