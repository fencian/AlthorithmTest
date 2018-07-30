package offer;
//0 - n-1数字 选一个数m 到最后一个是谁 约瑟夫环
public class LastRemaining_Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1) return -1;
        int last = 0;
        for(int i=2;i<=n;i++)
            last = (last+m)%i;
        return last;
    }
}
