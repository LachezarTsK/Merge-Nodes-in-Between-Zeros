
/*
 Function ListNode is in-built in the solution file on leetcode.com. 
 When running the code on the website, do not include this function.
 */
/**
 * @param {number} val
 * @param {ListNode} next
 */
function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val);
    this.next = (next === undefined ? null : next);
}

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var mergeNodes = function (head) {
    let front = head.next;
    let back = head;
    let sumNodeValues = 0;

    while (front !== null) {

        sumNodeValues += front.val;
        if (front.val !== 0) {
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
};
