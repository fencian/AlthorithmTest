package offer;

import offer.datastructure.TreeNode;

import java.util.ArrayList;

//输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
// 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
public class FindPath {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> stack = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root==null) return res;//return null; wrong {},0 返回[]
        int num = 0;
        FindPathCore(root,target,stack,num);
        return res;
    }

    private void FindPathCore(TreeNode pNode, int expectednum, ArrayList<Integer> path, int currentnum) {
        currentnum += pNode.val;
        path.add(pNode.val);
        ArrayList<ArrayList<Integer>> total = new ArrayList<>();
        //判断叶子结点 返回 若是最后的叶子结点 节点和等于要求的值 则打印
        boolean isLeaf = (pNode.left==null)&&(pNode.right==null);
        if(expectednum==currentnum&&isLeaf)
            res.add(new ArrayList(path));
            //res.add(path); wrong
        if(pNode.left!=null) FindPathCore(pNode.left,expectednum,path,currentnum);
        if(pNode.right!=null) FindPathCore(pNode.right,expectednum,path,currentnum);
        path.remove(path.size()-1);
        return ;
    }

}
