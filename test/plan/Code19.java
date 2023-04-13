package plan;

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class Code19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=length(head);
        if(n==length){
            return head.next;
        }
        ListNode res=head;
        int num=0;
        while (num<length){
            num++;
            if(num==length-n){
                res.next=res.next.next;
                return head;
            }
            res=res.next;
        }
        return null;
    }

    public static int length(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }

}
