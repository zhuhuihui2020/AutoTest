package leetcode;
//相交链表

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Code160 {
    public ListNode2 getIntersectionNode(ListNode2 headA, ListNode2 headB) {
        HashSet<ListNode2> hashSet=new HashSet<>();
        while (headA!=null){
            hashSet.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if(hashSet.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}
