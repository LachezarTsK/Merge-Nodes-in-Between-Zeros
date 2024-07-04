
package main

import "fmt"

type ListNode struct {
    Val  int
    Next *ListNode
}

func mergeNodes(head *ListNode) *ListNode {
    front := head.Next
    back := head
    sumNodeValues := 0

    for front != nil {

        sumNodeValues += front.Val
        if front.Val != 0 {
            front = front.Next
            continue
        }

        front = front.Next
        back.Val = sumNodeValues
        back.Next = front
        back = back.Next
        sumNodeValues = 0
    }

    return head
}
