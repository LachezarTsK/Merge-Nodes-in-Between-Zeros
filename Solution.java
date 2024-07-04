
public class Solution {

    public ListNode mergeNodes(ListNode head) {
        ListNode front = head.next;
        ListNode back = head;
        int sumNodeValues = 0;

        while (front != null) {

            sumNodeValues += front.val;
            if (front.val != 0) {
                front = front.next;
                continue;
            }

            front = front.next;
            back.val = sumNodeValues;
            back.next = front;
            back = back.next;
            sumNodeValues = 0;
        }

        return head;
    }
}

/*
Class ListNode is in-built in the solution file on leetcode.com. 
When running the code on the website, do not include this class.
 */
class ListNode {

    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
