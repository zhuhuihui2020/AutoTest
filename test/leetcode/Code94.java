package leetcode;

import java.util.ArrayList;
import java.util.List;

//二叉树的中序遍历
public class Code94 {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if(root==null){
            return;
        }
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }

}
