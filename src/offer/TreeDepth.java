package offer;

import offer.datastructure.TreeNode;
//输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        if(root==null) return 0;
        int treeleft=TreeDepth(root.left);
        int treeright = TreeDepth(root.right);
        return (treeleft>treeright)?(treeleft+1):(treeright+1);
    }
}
