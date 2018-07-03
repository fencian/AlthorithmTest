package sevenSort;
/**
 * 时间复杂度：平均情况O(n1.25)
 空间复杂度：O(1)
 不是稳定排序
 原理：将无序数组分割为若干个子序列，子序列不是逐段分割的，而是相隔特定的增量的子序列，
 对各个子序列进行插入排序；然后再选择一个更小的增量，再将数组分割为多个子序列进行排序……最后选择增量为1，
 即使用直接插入排序，使最终数组成为有序。
 */
//优化 三相希尔排序
public class shellSort {
    public static void sort(int[] arr){
        //checkRange(arr.length, fromIndex, toIndex);
        int adder = arr.length / 2;  //增量
        while (adder > 0){
            //从adder开始，每次排序均与前面的adder(当adder是1时就是插入排序)处的元素比较
            for (int i = adder ; i < arr.length; i++){
                int j;
                int tmp = arr[i];
                for (j = i; j >= adder && tmp < arr[j - adder]; j = j - adder){
                    arr[j] = arr[j - adder];
                }
                arr[j] = tmp;
            }
            adder /= 2;
        }
    }
}
