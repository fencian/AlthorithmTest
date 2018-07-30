package offer;

import java.util.Arrays;
//判断扑克牌顺子
public class isContinuous {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0||numbers==null) return false;
        int numOfZero=0;
        int numOfInterval = 0;
        int length = numbers.length;
        Arrays.sort(numbers);
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]==0) {
                numOfZero++;
                continue;
            }//注意顺序
            if (numbers[i]==numbers[i+1]) return false;

            numOfInterval +=numbers[i+1]-numbers[i]-1; //要是间隔相同就可以呢 13579也可以比如？
        }
        return (numOfInterval<=numOfZero)?true:false;
    }

}
