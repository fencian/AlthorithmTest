package offer;


import java.util.HashMap;

//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) { // 快排 nlogn 不行
        if(array==null) return Integer.parseInt(null);
        //
        if(array.length<=0)
            return 0;
        int middle = array.length/2;
        int start = 0;
        int end = array.length-1;
        int index = Partition(array,start,end);
        while (index!=middle){
            if(index>middle){
                index = Partition(array,start,index-1);
            }
            else{
                index = Partition(array,index+1,end);
            }
        }
        int result = array[middle];
        int times =0;
        for( int i = 0;i<array.length;i++){
            if(result== array[i]) times++;
        }
        if(times*2<=array.length){
            return 0;
        }
        else{
            return result;
        }
    }

/*    private int Partition(int[] array,  int start, int end) {
        int tmp = array[start];
        while (start<end){
            while (start<end&&tmp<array[end]) end--;
            if (start<end)
                array[end] =array[start];
            while (start<end&&tmp>array[start]) start++;
            if (start<end)
                array[start] = array[end];
        }

        array[start] =tmp;
        return start;
    }*/

    private int Partition(int array[],int start,int end){
        int pivotkey=(int)start+(int)Math.random()*(end-start);
        while(start<end){
            while(start<end&&array[end]>=array[pivotkey])
                end--;
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            while(start<end&&array[start]<=array[pivotkey])
                start++;
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
        }
        return start;
    }


}
