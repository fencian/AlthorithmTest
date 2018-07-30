package offer;
//统计一个数字在排序数组中出现的次数 二分查找
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if(array.length<=0) return 0;
        int count = 0;
        int firstK = getFirstK(array,k,0,array.length-1);
        int lastK = getLastK(array,k,0,array.length-1);
        if(firstK!=-1&&lastK!=-1) count = lastK-firstK+1;
        return count;
    }
    private int getFirstK(int[] array, int k, int start, int end) {
        if(start>end) return -1;
        int mid = (start+end)>>1;
        if(array[mid]>k) return getFirstK(array,k,start,mid-1);
        else if (array[mid]<k) return getFirstK(array,k,mid+1,end);
        else if(array[mid-1]==k&&mid-1>=0) return getFirstK(array,k,start,mid-1);
        else return mid;
    }


    private int getLastK(int[] array, int k, int start, int end) {
        int length = array.length;
        int mid  = (start+end)>>1;
        while (start<=end){
            if(array[mid]<k) start = mid+1;
            else if(array[mid]>k) end = mid-1;
            else if(mid+1<length&&array[mid+1]==k) start=mid+1;
            else return mid;
            mid=(start+end)>>1;
        }
        return -1;
    }


}
