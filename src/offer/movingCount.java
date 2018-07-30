package offer;
//地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。返回走过多少格子
public class movingCount {
    public int movingCount(int threshold, int rows, int cols)
    {
        int[][] flag = new int[rows][cols];//记录是否已经走过
        return helper(0, 0, rows, cols, flag, threshold);
    }

    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
        if(i<0||i>=rows||j<0||j>=cols||flag[i][j]==1||threshold<numSum(i)+numSum(j))
        return 0;
        flag[i][j]=1;
        return 1+helper(i+1, j, rows, cols, flag, threshold)+helper(i-1, j, rows, cols, flag, threshold)+helper(i, j+1, rows, cols, flag, threshold)+helper(i, j-1, rows, cols, flag, threshold);

    }

    private int numSum(int num) {
        int sum = 0 ;
        while ((num%10)!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}
