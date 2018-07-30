package offer;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
// 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class reOrderArray {
    public void reOrderArray(int [] array) {
        if(array.length==0||array==null) return;
        int i=0;
        int j;
        while (i<array.length){
            while ((i<array.length)&&(!isEven(array[i]))) i++;//为什么条件前后交换就不行了啊？？？？ [1]先判断了前面 变为i++ 因此错误 必须先判断长度
            j=i+1;
            while (j<array.length&&isEven(array[j])) j++;//为什么条件前后交换就不行了啊？？？？
            if(j<array.length){
                int tmp  = array[j];
                for (int j2= j-1 ; j2>=i;j2--){
                    array[j2+1]=array[j2];
                }
                array[i++] = tmp;
            }else{
                break;
            }

        }
    }

    private boolean isEven(int i) {
        if(i%2==0) return true;
        return false;
    }
}
