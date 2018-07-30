package offer.TreeNode;
//判断一颗二叉树是不是对称的
// 如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
public class isSymmetrical {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if (pRoot==null) return true;
        return comRoot(pRoot.left,pRoot.right);
    }

    private boolean comRoot(TreeNode left, TreeNode right) {
        if (left==null) return right==null;//返回是不是空的true或false
        if (right==null) return left==null;
        if (left.val!=right.val) return false;
        return comRoot(left.right,right.left)&&comRoot(left.left,right.right);
    }
}
