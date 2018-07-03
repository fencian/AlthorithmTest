package sevenSort;
//时间复杂度：最好O(n)，平均和最外情况O(n2)
//空间复杂度：O(1)
//稳定排序原理：从数组第一个元素开始，依次比较前面已经排序的部分，插入合适的位置，前面排序部分比当前值大的部分向后移动一个。
public class insertionSort {
    public void Sort(int[] arr){
        if(arr==null) return;
        int tmp;
        for (int i=1;i<arr.length;i++){
            tmp = arr[i];
            int j;
            for (j=i;j>0&&tmp<arr[j-1];j--){
                arr[j] = arr[j-1];
            }
            arr[j]=tmp;//实现了arr[i] 替换为其他值 arr[j]变为tmp 传统的tmp = arr[i];arr[j这里是i] = arr[j-1];arr[j]=tmp;
        }
        for (int k = 0 ;k<arr.length;k++)
        System.out.println(arr[k]);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,5,2,4,3};
        insertionSort insertionSort = new insertionSort();
        insertionSort.Sort(arr);
    }
}
