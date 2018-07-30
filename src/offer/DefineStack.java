package offer;
import java.util.Stack;
//定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数。
public class DefineStack {
    Integer temp = null;
    Stack<Integer> minStack  =new Stack<>();
    Stack<Integer> dataStack =new Stack<>();
    public void push(int node) {
        if(temp!=null){
            if(temp>=node){
                temp = node;
                minStack.push(node);
            }
            else {
                temp = node;
                minStack.push(node);
                dataStack.push(node);
            }
        }
    }

    public void pop() {
        int num = dataStack.pop();
        int num1 = minStack.pop();
        if(num!=num1) minStack.push(num1);
    }

    public int top() {
        int num = dataStack.pop();
        dataStack.push(num);
        return num;
    }

    public int min() {
        int num = minStack.pop();
        minStack.push(num);
        return num;
    }
}
