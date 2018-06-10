package offer.printListFromTailToHead;
//输入一个链表，从尾到头打印链表每个节点的值。
/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class PrintListFromTailToHead {


    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//栈
        /*        if(listNode==null) return null;
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        while(stack.empty()==false)
        ret.add(stack.pop());
        return ret;*/
        //头插法 把每一次要拿的节点复制 头插进去
        ArrayList<Integer> ret = new ArrayList<>();
        ListNode head = new ListNode(-1);//头节点 不代表任何意义
        while(listNode!=null){
            ListNode memo = listNode.next;// 找一个暂时的头部 memo 指向listnode的下一个节点
            listNode.next =  head.next ;//头插法  把listnode指向头部的下一个节点从左向右读
            head.next = listNode;//插入listnode完成
            memo = listNode;//令memo成为listnode
        }

        head = head.next;
        while(head!=null){
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }

    public static void main(String[] args) {
        PrintListFromTailToHead p = new PrintListFromTailToHead();
        ListNode l = new ListNode(1);
        ListNode m = new ListNode(2);
        ListNode n = new ListNode(3);
        ListNode o = new ListNode(4);
        ListNode pp = new ListNode(5);
        ListNode q = new ListNode(6);
        ListNode r = new ListNode(7);

        l.next=m;m.next=n;n.next=o;o.next=pp;pp.next=q;q.next=r;
        ArrayList<Integer> show = new ArrayList<>();
        show=p.printListFromTailToHead(l);
        Iterator<Integer> it = show.iterator();
        while (it.hasNext()){
            Integer in = it.next();
            System.out.println(in);
        }
    }
}