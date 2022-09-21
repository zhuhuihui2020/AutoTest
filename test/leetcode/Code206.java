package leetcode;
//反转链表

import java.util.ArrayList;

/**
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class Code206 {
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> listNodes=new ArrayList<>();
        ListNode listNode=new ListNode();
        while(head.next!=null){
            listNode.val=head.val;
            listNode.next=null;
            listNodes.add(listNode);
            head=head.next;
        }
        for (int j=listNodes.size()-1;j>0;j--){
            listNodes.get(j).next=listNodes.get(j-1);
        }
        return listNodes.get(listNodes.size()-1);
    }
}
