package leetcode;
//回文链表
public class Code234 {
    public boolean isPalindrome(ListNode head) {
        int length=length(head);
        int[] list=new int[length];
        for (int i=0;i<length;i++){
            list[i]=head.val;
            head=head.next;
        }
        for(int i=0;i<length/2;i++){
            if (list[i]!=list[length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static int length(ListNode listNode){
        int i=0;
        while(listNode!=null){
            i++;
            listNode=listNode.next;
        }
        return i;
    }
}
