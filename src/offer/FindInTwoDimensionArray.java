package offer;

/**
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindInTwoDimensionArray {
    public boolean Find(int target, int [][] array) {
        if(array.length==0) return false;
        int i = 0;
        int j = array[0].length-1;
        while(j>=0&&(i<array.length)){
            if(target==array[i][j]) return  true;
            if(target>array[i][j]) i++;
            else j--;
        }
        return false;
    }

    public static void main(String[] args) {
        FindInTwoDimensionArray f = new FindInTwoDimensionArray();
        int [][] array  = {{1,2,8,9},{4,7,10,13}};
        f.Find(7,array);
    }
}
