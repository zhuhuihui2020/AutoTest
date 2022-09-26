package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的最大深度
//广度优先搜索 Breadth first search
//队列

/**
 * Queue 中 add() 和 offer()都是用来向队列添加一个元素。
 * 在容量已满的情况下，add() 方法会抛出IllegalStateException异常，offer() 方法只会返回 false 。
 */
public class Code104_2 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int ans=0;
        while (!queue.isEmpty()){
            int size=queue.size();
            while (size>0){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
}
