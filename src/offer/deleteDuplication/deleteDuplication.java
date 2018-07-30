package offer.deleteDuplication;
//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
// 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
public class deleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {

        if(pHead==null||pHead.next==null)
        return pHead;
        if (pHead.val==pHead.next.val){
            ListNode pNode=pHead.next;
            while (pNode.val==pHead.val){
                pNode=pNode.next;
            }
            return deleteDuplication(pNode);
        }
        else {
            // pHead.next = deleteDuplication(pHead.next); 实参pHead.next表示将当前节点与下一节点不同，
            // 所以要将下一节点放入递归程序去参加下一轮的比较，这样就将pHead保留了下来。返回值给pHead.next表示deleteDuplication返回了一个无重复的节点，所以要让当前节点指向它。
            pHead.next=deleteDuplication(pHead.next);
            return pHead;
        }


/*        ListNode first = new ListNode(-1);
        first.next=pHead;
        ListNode last = first;
        ListNode p = pHead;
        while (p!=null&&p.next!=null){
            if(p.val==p.next.val){
                int val = p.val;
                while (p!=null&&p.val==val)
                    p=p.next;
                last.next=p;
            }
            else {
                last=p;
                p=p.next;
            }
        }
        return first.next;*/
    }
}
