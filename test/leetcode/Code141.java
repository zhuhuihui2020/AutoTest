package leetcode;
//环形链表
import java.util.HashSet;

//暴力解法
public class Code141 {
    public boolean hasCycle(ListNode2 head) {
        HashSet<ListNode2> listNodes=new HashSet<>();
        while(head!=null){
            if(!listNodes.add(head)){
                return true;
            }else{
                listNodes.add(head);
                head=head.next;
            }
        }
        return false;
    }
}
