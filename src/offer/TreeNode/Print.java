package offer.TreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
public class Print {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();
        if (pRoot==null) return arrayLists;
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(null);//层分隔符
        queue.addLast(pRoot);
        boolean LeftToRight = true;
        while (queue.size()!=1){
            TreeNode node = queue.removeFirst();
            if (node==null){
                Iterator<TreeNode> itea = null;
                //itea = queue.iterator();
                if(LeftToRight) itea = queue.iterator();
                else itea = queue.descendingIterator();
                LeftToRight = !LeftToRight;
                while (itea.hasNext()){
                   TreeNode temp = itea.next();
                   list.add(temp.val);
                }
                arrayLists.add(new ArrayList<>(list));
                list.clear();
                queue.addLast(null);
                continue;
            }
            if (node.left!=null){
                queue.addLast(node.left);
            }
            if (node.right!=null){
                queue.addLast(node.right);
            }
        }
        return arrayLists;
    }

}
