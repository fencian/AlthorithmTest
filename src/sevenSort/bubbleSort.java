package sevenSort;
//从第一个元素开始，依次比较相邻两个元素，如果前者比后者大，
// 那么就交换者两个元素，然后处理下一组，依次类推，直到排序完成。
public class bubbleSort {
    public void sort(int[] arr){
        boolean isChanged = false;
        for(int i = 0; i<arr.length-1 ; i++){
            isChanged =false;
            for (int j = 0; j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isChanged = true;
                }
            }
            if(!isChanged) break;
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2};
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);
      //  System.out.println(arr[arr.length]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
    }
}
