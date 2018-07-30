package offer;

import java.util.ArrayList;
//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(input ==null||k<=0||k>input.length||input.length<=0) return arrayList;
        int start = 0;int end = input.length-1;
        int index = Partition(input,start,end);
        while (index!=k-1){
            if(index>k-1){
                index = Partition(input,start,index-1);
            }
            else index = Partition(input,index+1,end);
        }

        for (int i =0;i<k;i++)
            arrayList.add(input[i]);
        return  arrayList;
    }

    private int Partition(int arr[], int start, int end) {
        int pivotkey = (int) (start+Math.random()*(end-start));
        while (start<end){
            while (start<end&&arr[end]>=arr[pivotkey]) end--;//等于号！
            swap(arr,start,end);
            while (start<end&&arr[start]<=arr[pivotkey]) start++;//等于号！
            swap(arr,start,end);
        }
        return start;
    }

    private void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
    }
}
