package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if (size==0) return res;
        int begin;
        //q里面也是下标
        ArrayDeque<Integer> q = new ArrayDeque<>();
        //每次在for循环里比较 双端队列里只容许 size个元素
        for (int i = 0;i<num.length;i++){
            begin = i-size+1;
            if (q.isEmpty()) q.add(i);
            else if(begin>q.peekFirst()) q.pollFirst();

            while ((!q.isEmpty())&&num[q.peekLast()]<=num[i]) q.pollLast();
            q.add(i);
            if(begin >= 0)//确定是从第一个滑动窗口开始 否则出来的是第一个窗口的前几个值
            res.add(num[q.peekFirst()]);
        }
        return res;
    }
}
