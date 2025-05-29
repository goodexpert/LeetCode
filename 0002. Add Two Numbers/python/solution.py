# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        head: Optional[ListNode] = None
        prev: Optional[ListNode] = None
        value = 0

        while l1 or l2 or value > 0:
            value += (l1.val if l1 else 0) + (l2.val if l2 else 0)

            newNode = ListNode(value % 10)
            if prev:
                prev.next = newNode
            else:
                head = newNode
            prev = newNode

            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            value //= 10

        return head
