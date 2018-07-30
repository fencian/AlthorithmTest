package offer;

import offer.datastructure.TreeNode;
//输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
// 要求不能创建任何新的结点，只能调整树中结点指针的指向。
public class Convert {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        if(pRootOfTree.right==null&&pRootOfTree.left==null) return pRootOfTree;
        TreeNode left = Convert(pRootOfTree.left);
        TreeNode p = left;
        while (p!=null&&p.right!=null)
            p=p.right;
        if(left!=null){
            p.right = pRootOfTree;
            pRootOfTree.left=p;
        }
        TreeNode right = Convert(pRootOfTree.right);
        if(right!=null){
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }

        return left!=null?left:pRootOfTree;
    }
}
