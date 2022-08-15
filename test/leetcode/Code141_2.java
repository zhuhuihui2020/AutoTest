package leetcode;
//环形链表
//快慢指针
public class Code141_2 {
    public boolean hasCycle(ListNode2 head) {
        if(head==null){
            return false;
        }
        ListNode2 slow=head;
        ListNode2 quick=head;
        while (quick != null && quick.next != null){
            slow=slow.next;
            quick=quick.next.next;
            if(quick==slow){
                return true;
            }
        }
        return false;
    }

    //环形链表不要求长度呀，会死循环的
    public static int length(ListNode2 listNode){
        int i=0;
        while(listNode!=null){
            i++;
            listNode=listNode.next;
        }
        return i;
    }
}