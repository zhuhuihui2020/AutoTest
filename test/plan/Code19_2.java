package plan;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
//双指针
//先让快指针移动n个位置，再快慢一起移动
public class Code19_2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int num=0;
        ListNode slow=head;
        ListNode quick=head;
        while (num<n){
            quick=quick.next;
            num++;
        }
        //quick==null, 删除的是头结点
        if(quick==null){
            return head.next;
        }
        while (quick.next!=null){
            quick=quick.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

}
