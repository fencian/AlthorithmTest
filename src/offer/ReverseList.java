package offer;

import offer.printListFromTailToHead.ListNode;
//输入一个链表，反转链表后，输出新链表的表头。
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head==null) return null;
        if (head.next==null) return head;
        ListNode pre = null;
        ListNode pNode = head;
        while (pNode!=null){
            ListNode pNext = pNode.next;
            pNode.next = pre;
            pre = pNode;
            pNode = pNext;
            if(pNode!=null)
            pNext = pNext.next;
            else break;
        }
        return pre;
    }
}
