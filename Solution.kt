
/*
Class ListNode is in-built in the solution file on leetcode.com.
When running the code on the website, do not include this class.
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeNodes(head: ListNode?): ListNode? {
        var front = head!!.next
        var back = head
        var sumNodeValues = 0

        while (front != null) {

            sumNodeValues += front.`val`
            if (front.`val` != 0) {
                front = front.next
                continue
            }

            front = front.next
            back!!.`val` = sumNodeValues
            back.next = front
            back = back.next
            sumNodeValues = 0
        }

        return head
    }
}
