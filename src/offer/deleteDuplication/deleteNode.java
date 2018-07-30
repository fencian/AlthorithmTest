package offer.deleteDuplication;
//在 O(1) 时间内删除链表节点
public class deleteNode {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if(head==null||tobeDelete==null||head.next==null) return null;
        if(tobeDelete.next!=null){
            ListNode pNode = tobeDelete.next;//复制需删除节点的下一个节点的信息
            tobeDelete.val = pNode.val;//覆盖要删除节点的值
            tobeDelete.next = pNode.next;//令删除后的节点指向下下个节点
        }
        else {//是最后一个节点
            ListNode cur = head;
            while (cur.next!=tobeDelete){
                cur = cur.next;
            }
            cur.next=null;
        }
        return head;
    }
}
