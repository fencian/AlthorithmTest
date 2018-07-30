package offer;

import offer.datastructure.TreeNode;
//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
public class HasSubtree {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null) return false;
        boolean result = false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val) result=DoesTree1HaveTree2(root1,root2);
            if(!result) result= HasSubtree(root1.left,root2);//result= 不是return 一步步执行下去 这是递归遍历过程 找到相等的值
            if(!result) result= HasSubtree(root1.right,root2);
        }
/*   不对   if(root1.val==root2.val) result=DoesTree1HaveTree2(root1,root2);
        if(!result) return HasSubtree(root1.left,root2);
        if(!result) return HasSubtree(root1.right,root2);*/
        return result;
    }

    private boolean DoesTree1HaveTree2(TreeNode root1, TreeNode root2) {
        if(root2==null) return true;
        if (root1==null) return false;
        if(root1.val!=root2.val) return false;

        return DoesTree1HaveTree2(root1.left,root2.left)&&DoesTree1HaveTree2(root1.right,root2.right);
/*    一样 boolean result1=false;
         boolean result2 = false;
        result1=DoesTree1HaveTree2(root1.left,root2.left);
        result2=DoesTree1HaveTree2(root1.right,root2.right);
        if(result1&&result2) return true;
        else return false;*/
    }
}
