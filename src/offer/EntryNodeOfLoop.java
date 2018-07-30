package offer;

import offer.datastructure.ListNode;
//给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
public class EntryNodeOfLoop {
    //2个指针速度一样，那么，当从原点的指针走到环入口点的时候（此时刚好走了x）
    //从相遇点开始走的那个指针也一定刚好到达环入口点。
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null||pHead.next.next==null) return null;
        ListNode slow = pHead.next;
        ListNode fast = pHead.next.next;
        while (slow!=fast){
            if(fast.next!=null&&fast.next.next!=null){
                fast = fast.next.next;
                slow= slow.next;
            }
            else return null;
        }
        slow = pHead;
        while (slow!=fast){
            slow = slow.next;
            fast= fast.next;
        }
        return fast;
    }
}
