package offer;

import java.util.ArrayList;
//输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        if(sum<3) return null;
        int small = 1 ; int big = 2; int mid = (1+sum)/2;//1+sum
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int cursum = small+big;
        while(small<mid){
            if (cursum==sum) {
                ArrayList<Integer> arrayList = addArraylist(small,big);
                list.add(arrayList);
            }
            while (cursum>sum&&small<mid){
                cursum-=small;
                small++;
                if (cursum==sum){
                    ArrayList<Integer> arrayList = addArraylist(small,big);
                    list.add(arrayList);
                }
            }
            big++;
            cursum+=big;
        }
        return list;
    }

    private ArrayList<Integer> addArraylist(int small, int big) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=small;i<=big;i++) arrayList.add(i);// =
        return arrayList;
    }
}
