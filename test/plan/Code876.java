package plan;

/**
 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Code876 {
    public ListNode middleNode(ListNode head) {
        int length=length(head)/2;
        while (length>0){
            head=head.next;
            length--;
        }
        return head;
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
