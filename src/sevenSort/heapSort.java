package sevenSort;
/**
 * 时间复杂度：最好、平均和最坏情况均为O(nlogn)
 空间复杂度：O(1)
 不是稳定排序
 原理：建立初始堆，从最后一个非叶结点开始，往前遍历，判断以该节点的开始的堆是否是符合，不符合则调整需要建立大顶堆，每次将子节点中较大地一个数往上移动，
 直到叶结点(堆：结点n的父节点为(n-1)/ 2，其左右子节点为2*n+1和2*n+2大根堆为根结点的值大于等于左右子结点的值)，
 然后依次将堆顶值与为排序的最后一个值交换，然后调整前面的值为大顶堆，每次将最大的值排好序。
 实现：
 */
public class heapSort {

    /**
     * 堆排序
     */
    public static  void sort(int[] arr){
        //建立初始堆，从最后一个非叶结点开始，往前遍历，判断以该节点的开始的堆是否是符合，不符合则调整
        //需要建立大顶堆，每次将子节点中较大地一个数往上移动，直到叶结点
        //节点n的父节点为(n-1)/ 2，其左右子节点为2*n+1和2*n+2
        //大根堆为根结点的值大于等于左右子结点的值
        for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--){
            adjustHeap(arr, i, arr.length-1);
        }
        //依次将堆顶值与为排序的最后一个值交换，然后调整前面的值为大顶堆
        for (int i = arr.length - 1; i >= 1; i--){
            //交换 利用位运算的方式进行数据的交换，利用的思想原理是：一个数异或同一个数两次，结果还是那个数，而且不会超出int范围
            arr[0] ^= arr[i];
            arr[i] ^= arr[0];
            arr[0] ^= arr[i];
            //调整
            adjustHeap(arr, 0, i - 1);
        }
        for (int m = 0;m<arr.length;m++) System.out.println(arr[m]);
    }

    /**
     * 调整为大顶堆
     * @param arr
     * @param i 以i为堆的堆顶
     * @param last 堆顶的最后一个结点的索引
     */
    private static void adjustHeap(int[] arr, int i, int last) {
        //建立以i结点为根的堆，判断子结点是否大于该节点，并将较大地值拷贝，然后继续判断
        int tmp = arr[i];
        for (int j = i * 2 + 1; j <= last; j = j * 2 + 1){
            //获得左右子树中较大的一个数的下标
            if (j < last && arr[j] < arr[j+1]) j++;  //存在右子结点且右子结点较大
            if (tmp >= arr[j]) break;  //根结点比较大，则完成
            //将较大的值作为根
            arr[i] = arr[j];
            i = j;   //继续往下判断，j的位置的值是最初的根结点
        }
        arr[i] = tmp;  //最后确定的位置，没有子结点或者比子结点的值大；
    }

    public static void main(String[] args) {
        heapSort h =new heapSort();
        int[] arr = {1,4,2,4,5,8};
        h.sort(arr);
    }
}


