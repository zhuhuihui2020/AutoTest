package leetcode;
//相交链表
//先让两个链表的剩余长度相同，再同步移动
public class Code160_2 {
    public ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        int lengthA=length(headA);
        int lengthB=length(headB);
        if(lengthA>lengthB){
            int diff=lengthA-lengthB;
            while (diff>0){
                headA=headA.next;
                diff--;
            }
        }else if(lengthA<lengthB){
            int diff=lengthB-lengthA;
            while (diff>0){
                headB=headB.next;
                diff--;
            }
        }
        do{
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }while (headA!=headB);
        return headA;
    }

    public static int length(ListNode2 listNode2){
        int length=0;
        while (listNode2!=null){
            length++;
            listNode2=listNode2.next;
        }
        return length;
    }
}
