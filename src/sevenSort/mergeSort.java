package sevenSort;

public class mergeSort {
    //把数组分成两个部分分别排序 加上指针 比大小 四种判断情况 左空右入 右空左入 左小入左 右小入右 从小到大排序 lo mid hi
    public static void sort(int[] arr){
        //创建数组，辅助排序
        int[] copy = new int[arr.length];
        sortCore(arr, copy, 0, arr.length - 1);
    }

    /**
     * 归并排序核心实现
     * @param arr 排序的数组
     * @param copy 辅助空间
     * @param start 开始位置
     * @param end 结束位置
     * @param offset 索引相对于原数组的偏移
     */
    private static void sortCore(int[] arr, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = arr[start];
            return;  }

        int mid = (end - start) / 2 + start;

        //分成两部分，递归
        sortCore(arr, copy, start, mid);
        sortCore(arr, copy, mid + 1, end);

        //合并两个部分，将合并结果存入
        int forward = mid;
        int behand = end;

        int last = end;

        while (forward >= start && behand > mid){
            if (copy[forward] > copy[behand]){
                arr[last --] = copy[forward --];
            }else {
                arr[last --] = copy[behand --];
            }
        }

        while (forward >= start){
            arr[last --] = copy[forward --];
        }

        while (behand > mid){
            arr[last --] = copy[behand --];
        }

        //拷贝到copy数组
        for (int i = start; i <= end; i++){
            copy[i] = arr[i];
        }

    }
}


