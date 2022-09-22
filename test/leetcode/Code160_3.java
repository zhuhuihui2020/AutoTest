package leetcode;
//相交链表
//双指针
public class Code160_3 {
    public ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        ListNode2 A=headA;
        ListNode2 B=headB;
        while (A!=B){
            A=(A==null?headB:A.next);
            B=(B==null?headA:B.next);
        }
        return A;
    }
}
