package leetcode;

//二叉树的最大深度
//深度优先搜索 Deep first search
//递归
public class Code104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int right=maxDepth(root.right);
        int left=maxDepth(root.left);
        return  Math.max(left,right)+1;
        //Math.max更容易阅读和理解，其实Math.max用的也是三目运算符
//        return (right>left?right:left)+1;
    }

}
