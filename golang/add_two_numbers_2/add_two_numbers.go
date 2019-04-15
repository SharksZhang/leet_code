package __add_two_numbers


type ListNode struct {
      Val int
      Next *ListNode
  }

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	temp := &ListNode{}
	result := temp
	p := l1
	q := l2
	carry := 0
	for p != nil && q != nil {
		temp.Next = &ListNode{}
		temp.Next.Val = (carry + p.Val + q.Val) %10
		carry = (carry + p.Val + q.Val) / 10
		p = p.Next
		q = q.Next
		temp = temp.Next
	}
	for p != nil{
		temp.Next =&ListNode{}
		temp.Next.Val = (carry + p.Val ) %10
		carry = (carry + p.Val ) / 10
		p = p.Next
		temp = temp.Next
	}
	for q != nil{
		temp.Next =&ListNode{}
		temp.Next.Val = (carry + q.Val ) %10
		carry = (carry + q.Val ) / 10
		q = q.Next
		temp = temp.Next
	}
	if carry != 0{
		temp.Next = &ListNode{}
		temp.Next.Val = carry
	}
	return result.Next
}

