
using namespace std;

/*
Struct ListNode is in-built in the solution file on leetcode.com. 
When running the code on the website, do not include this struct.
 */
struct ListNode {
    int val;
    ListNode* next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode* next) : val(x), next(next) {}
};

class Solution {

public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode* front = head->next;
        ListNode* back = head;
        int sumNodeValues = 0;

        while (front != nullptr) {

            sumNodeValues += front->val;
            if (front->val != 0) {
                front = front->next;
                continue;
            }

            front = front->next;
            back->val = sumNodeValues;
            back->next = front;
            back = back->next;
            sumNodeValues = 0;
        }

        return head;
    }
};
