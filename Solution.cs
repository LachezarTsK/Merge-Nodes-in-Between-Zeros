
using System;

/*
Class ListNode is in-built in the solution file on leetcode.com. 
When running the code on the website, do not include this class.
 */
public class ListNode
{
    public int val;
    public ListNode next;
    public ListNode(int val = 0, ListNode next = null)
    {
        this.val = val;
        this.next = next;
    }
}

public class Solution
{
    public ListNode MergeNodes(ListNode head)
    {
        ListNode front = head.next;
        ListNode back = head;
        int sumNodeValues = 0;

        while (front != null)
        {
            sumNodeValues += front.val;
            if (front.val != 0)
            {
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
