package offer;
//回溯法 输入数字 n，按顺序打印出从 1 最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
public class printNumber {
    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, -1);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length - 1) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit + 1] = (char) (i + '0');//默认是0-9的全排列写法 先依次把最高位设为0 再进行低位运算 digit是位的运算 加到9 就跳到下一个这个for中
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        //每一次从头判断是不是098 到第一个不是0开头的跳出
        while (index < number.length && number[index] == '0')
            index++;
        //按顺序输出
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

    public static void main(String[] args) {
        printNumber printNumber = new printNumber();
        printNumber.print1ToMaxOfNDigits(2);
    }
}
