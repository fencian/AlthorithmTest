package offer;
//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
// 输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
public class InversePairs {
    public int InversePairs(int [] array) {
        if(array.length<=0||array==null) return 0;
        int[] copy = new int[array.length];
        copy = array.clone();
        int count = InversePairsCore(array,copy,0,array.length-1);
        return count;
    }
//mergesort
    private int InversePairsCore(int[] array, int[] copy, int low, int high) {
        if(low==high)
        return 0;
        int count = 0;
        int mid=(high+low)/2;
        int leftcount = InversePairsCore(array,copy,low,mid)%1000000007;
        int rightcount = InversePairsCore(array,copy,mid+1,high)%1000000007;
        int i=mid;
        int j=high;
        int locCopy = high;
        while (i>=low&&j>mid){//?
           if(array[i]>array[j]){
               count += j-mid;
               copy[locCopy--]=array[i--];
               if(count>=1000000007){
                   count%=1000000007;
               }
           }
           else {
               copy[locCopy--]=array[j--];
           }
        }
        for(;i>=low;i--) copy[locCopy--]=array[i];
        for(;j>=mid;i--) copy[locCopy--]=array[j];
        for(int s=low;s<high;s++) array[s]=copy[s];
        return (leftcount+rightcount+count)%1000000007;
    }
}
