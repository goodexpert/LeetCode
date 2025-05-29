/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public var val: Int
 *     public var next: ListNode?
 *     public init() { self.val = 0; self.next = nil; }
 *     public init(_ val: Int) { self.val = val; self.next = nil; }
 *     public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
 * }
 */
class Solution {
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var head: ListNode? = nil
        var prev: ListNode? = nil
        var value = 0
        
        var p1 = l1
        var p2 = l2
        while p1 != nil || p2 != nil || value > 0 {
            value += (p1?.val ?? 0) + (p2?.val ?? 0)
            
            var newNode = ListNode(value % 10)
            if prev != nil {
                prev?.next = newNode
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
