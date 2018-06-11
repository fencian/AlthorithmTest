package offer;
import java.util.Stack;
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
public class TwoStackBeOneQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
         stack1.push(node);
        System.out.println(node+" is pushed");
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        }
        System.out.println(stack2.lastElement()+" is poped");
        return stack2.pop();
    }

    public static void main(String[] args) {
        int a=0,b=1,c=2,d=3;
        TwoStackBeOneQueue twoStackBeOneQueue = new TwoStackBeOneQueue();
        twoStackBeOneQueue.push(a);
        twoStackBeOneQueue.push(b);
        twoStackBeOneQueue.pop();
        twoStackBeOneQueue.push(c);
        twoStackBeOneQueue.push(d);
        twoStackBeOneQueue.pop();
        twoStackBeOneQueue.pop();

    }
}
