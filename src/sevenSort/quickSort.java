package sevenSort;

public class quickSort {
    public static void sort(int[] arr){
        sortCore(arr, 0, arr.length - 1);
    }

    /**
     * @param arr 排序的数组
     * @param start 开始位置
     * @param end 结束位置
     */
    private static void sortCore(int[] arr, int start, int end) {
        if(start < end){

            int poiv = partition(arr, start, end);
            if (poiv > start){
                sortCore(arr, start, poiv - 1);
            }
            if (poiv >= start && poiv < end){
                sortCore(arr, poiv + 1, end);
            }

        }

    }

    private static int partition(int[] arr, int start, int end) {

        int tmp = arr[start];

        while (start < end){
            while (start < end && arr[end] >= tmp) end--;

            if (start < end) {
                arr[start] = arr[end];
            }

            while (start < end && arr[start] < tmp) start++;

            if (start < end){
                arr[end] = arr[start];
            }
        }

        arr[start] = tmp;

        return start;
    }
}
