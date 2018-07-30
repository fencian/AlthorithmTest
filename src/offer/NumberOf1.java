package offer;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class NumberOf1 {
    public int NumberOf1(int n) {
        //return Integer.bitCount(n);
        int num =0;
        while (n!=0){
            num++;
            n=n&(n-1);
        }

        return num;
    }

    public static void main(String[] args) {
        int a = 123123;
        NumberOf1 n = new NumberOf1();
        System.out.println(n.NumberOf1(a));
    }
}
