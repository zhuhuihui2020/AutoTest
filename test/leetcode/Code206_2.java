package leetcode;
//反转链表
//迭代

/**
 * 假设链表为 1→2→3→∅，我们想要把它改成 ∅←1←2←3。
 */
public class Code206_2 {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;//前指针节点
        ListNode curr=head;//当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr!=null){
            ListNode next=curr.next;//临时节点，暂存当前节点的下一节点，用于后移
            curr.next=prev;//将当前节点指向它前面的节点
            prev=curr;//前指针后移
            curr=next;//当前指针后移
        }
        return prev;
    }
}
