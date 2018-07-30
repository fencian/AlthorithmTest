package offer;


import offer.deleteDuplication.ListNode;

//输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
public class Merge {
    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode mergehead = new ListNode(-1);
        ListNode head = mergehead;
        if(list1==null) return list2;
        if (list2==null) return list1;
        while (list1!=null&&list2!=null){
            if(list1.val<list2.val){
                mergehead.next = list1;
                mergehead = mergehead.next;
                list1 = list1.next;

            }else {
                mergehead.next = list2;
                mergehead = mergehead.next;
               list2 = list2.next;
            }
        }
            while(list1!=null){
                mergehead.next = list1;
                mergehead = mergehead.next;
                list1 = list1.next;

            }


            while(list2!=null){
                mergehead.next = list2;
                mergehead = mergehead.next;
                list2 = list2.next;
            }


        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(3);
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(6);
        l1.next=l2;
        l3.next=l4;
        l4.next=l5;
        Merge m = new Merge();
        ListNode l = null;
        l=m.Merge(l1,l3);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }

    }
}
