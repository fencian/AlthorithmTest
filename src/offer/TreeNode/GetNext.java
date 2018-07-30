package offer.TreeNode;
//给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
// 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
public class GetNext {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {//我们可发现分成两大类：1、有右子树的，那么下个结点就是右子树最左边的点；（eg：D，B，E，A，C，G）
     // 2、没有右子树的，也可以分成两类，a)是父节点左孩子（eg：N，I，L） ，那么父节点就是下一个节点 ；
     // b)是父节点的右孩子（eg：H，J，K，M）找他的父节点的父节点的父节点...直到当前结点是其父节点的左孩子位置。
     // 如果没有eg：M，那么他就是尾节点。
        if (pNode==null) return null;
        if (pNode.right!=null) {
            pNode = pNode.right;
            while (pNode.left!=null) pNode = pNode.left;
            return pNode;
        }
        while (pNode.next!=null) {//代表不是根节点 pnode.next表示 pnode的父节点
            if (pNode.next.left==pNode) return pNode.next;
            pNode=pNode.next;
        }
        return  null;
    }
}
