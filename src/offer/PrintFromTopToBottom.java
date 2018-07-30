package offer;
import java.util.ArrayList;
import offer.datastructure.TreeNode;
//从上往下打印出二叉树的每个节点，同层节点从左至右打印。

public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<TreeNode> arrayList1 = new ArrayList<TreeNode>();
        if(root==null) return arrayList;
        arrayList1.add(root);
        while (arrayList1.size()!=0){
            TreeNode temp = arrayList1.remove(0);
            if(temp.left!=null){
                arrayList1.add(temp.left);
            }
            if(temp.right!=null){
                arrayList1.add(temp.right);
            }
            arrayList.add(temp.val);
        }
    return arrayList;

    }
}
