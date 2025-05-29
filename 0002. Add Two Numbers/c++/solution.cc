/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* head = nullptr;
        ListNode* prev = nullptr;
        int value = 0;

        while (l1 != nullptr || l2 != nullptr || value > 0) {
            value += (l1 != nullptr ? l1->val : 0) + (l2 != nullptr ? l2->val : 0);

            ListNode *newNode = new ListNode(value % 10);
            if (prev != nullptr) {
                prev->next = newNode;
            } else {
                head = newNode;
            }
            prev = newNode;

            l1 = (l1 != nullptr ? l1->next : nullptr);
            l2 = (l2 != nullptr ? l2->next : nullptr);
            value /= 10;
        }
        return head;
    }
};
