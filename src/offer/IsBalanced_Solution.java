package offer;

import offer.datastructure.TreeNode;
//输入一棵二叉树，判断该二叉树是否是平衡二叉树。
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution(TreeNode root){
        if (root==null) return true;//true!
        int left = 0,right = 0;
        left = getDepth(root.left);
        right = getDepth(root.right);
        int diff = left-right;
        if(diff<-1||diff>1) return false;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }

    private int getDepth(TreeNode treeNode) {
        if (treeNode ==null) return 0;
        int left = 1+getDepth(treeNode.left);
        int right = 1+getDepth(treeNode.right);
        return (left>right)?left:right;
    }

}
