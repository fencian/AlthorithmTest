package offer;
//连续子数组的最大和
//在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
// 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
// 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
// 给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length==0||array==null) return 0;
        int cursum=0;
        //0x80000000 的二进制位
       // 原码 1000 0000 0000 0000 0000 0000 0000 0000
        // 原因是在十六进制中负数的二进制原码的最高位是符号位，后面的31位为序号位，不是值位
        int greatestsum = 0x80000000;
        for(int i=0;i<array.length;i++){
            if(cursum<=0) {
                cursum = array[i];
            }else {
                cursum+=array[i];
            }
            if(cursum>greatestsum){
                greatestsum = cursum;
            }
        }
        return  greatestsum;
    }
}
