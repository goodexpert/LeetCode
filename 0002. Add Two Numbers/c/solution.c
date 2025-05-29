/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* makeNode(int val) {
    struct ListNode* node = (struct ListNode *) malloc(sizeof(struct ListNode));
    node->val = val;
    node->next = NULL;
    return node;
}

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
    struct ListNode* head = NULL;
    struct ListNode* prev = NULL;
    int value = 0;

    while (l1 != NULL || l2 != NULL || value > 0) {
        value += (l1 != NULL ? l1->val : 0) + (l2 != NULL ? l2->val : 0);

        struct ListNode* newNode = makeNode(value % 10);
        if (prev != NULL) {
            prev->next = newNode;
        } else {
            head = newNode;
        }
        prev = newNode;

        l1 = (l1 != NULL ? l1->next : NULL);
        l2 = (l2 != NULL ? l2->next : NULL);
        value /= 10;
    }
    return head;
}
