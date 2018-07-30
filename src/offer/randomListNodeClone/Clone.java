package offer.randomListNodeClone;
//输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
// （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
public class Clone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
        else {
            CloneNodes(pHead);
            ConnectSiblingNodes(pHead);
            return ReconnectNodes(pHead);
        }
    }

    private RandomListNode ReconnectNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        RandomListNode clonehead = null;
        RandomListNode clonenode = null;
        clonehead = clonenode = pNode.next;
        pNode.next = clonenode.next;
        pNode = pNode.next;
        while(pNode!=null){
            //clonenode.next = pNode.next;
            // clonenode = clonenode.next;
            // pNode.next= clonenode.next;
            // pNode = pNode.next;//pnode移到 pclone 后面 循环

            clonenode.next = pNode.next;
            pNode.next = clonenode.next.next; //clonenode.next; wrong
            clonenode = clonenode.next;
            pNode = pNode.next;//pnode移到 pclone 后面 循环

        }
        return clonehead;
    }

    private void ConnectSiblingNodes(RandomListNode pHead) {
        RandomListNode pNode = pHead;
        while (pNode!=null){
            RandomListNode clone =pNode.next;//RandomListNode clone =pNode;
            if(pNode.random!=null)
                clone.random = pNode.random.next;
            pNode = clone.next;
        }
    }

    private void CloneNodes(RandomListNode pHead) {
        RandomListNode randomListNode = pHead;
        while (randomListNode!=null){
            RandomListNode clone = new RandomListNode(0);
            clone.label = randomListNode.label;
            clone.next = randomListNode.next;
            clone.random = null;
            randomListNode.next = clone;
            randomListNode = clone.next;
        }
    }
}
