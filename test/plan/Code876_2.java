package plan;

/**
 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
//快慢指针
public class Code876_2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode quick=head;
        while (quick!=null&&quick.next!=null){
            quick=quick.next.next;
            slow=slow.next;
        }
        return slow;
    }

}
