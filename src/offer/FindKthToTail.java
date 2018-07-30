package offer;
//输入一个链表，输出该链表中倒数第k个结点。
import offer.printListFromTailToHead.ListNode;

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null) return null;
        if(k<=0) return null;
        ListNode p=head;
        ListNode p2 =head;
        while(k>1){
            if(p.next!=null){
                p=p.next;
                k--;
            }
            else return null;
        }
        while (p.next!=null){
            p=p.next;
            p2=p2.next;
        }
        return p2;
    }
}
