package offer;
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
//一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length<2||array==null) return;
        int temp =0;
        for (int i=0;i<array.length;i++) temp ^= array[i];

        int indexOf1 = findFirstBitIs(temp);

        for (int j=0;j<array.length;j++){
            if(IsBit(array[j],indexOf1))
                //判断这一位是否是1 分成两个数组 清0 在一个数组上放置两个指针 重复的全变成0 剩下的与0 异或 是本身
                num1[0]^=array[j];
            else num2[0]^=array[j];
        }
    }

    private boolean IsBit(int i, int indexOf1) {
        i = i>>indexOf1;
        return (i&1)==1;
    }

    private int findFirstBitIs(int temp) {
        int indexBit = 0;
        //??考虑int的类型的取值范围了，如果int化成二进制，最多32位 0^0=1 0^1=1 1^1=0异或
        while (((temp&1)==0)&&(indexBit<(8<<2))) {
            temp = temp>>1;
            indexBit++;
        }
        return indexBit;
    }
}
