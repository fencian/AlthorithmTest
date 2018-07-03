package sevenSort;
//从第一个元素开始，每次逐一扫描选择未排序部分的最小值，排在已排序部分后面，
// 然后从下一个位置开始，继续进行相同的操作，直到排序完成。
public class selectionSort {
    public void sort(int[] arr){
        if (arr == null) return;
        int min;
        for(int i = 0; i<arr.length-1;i++){
            min=i;
            for (int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if (min!=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
