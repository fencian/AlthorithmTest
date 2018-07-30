package offer;

import java.util.ArrayList;
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
// 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class printMatrix {
    ArrayList<Integer> arrayList = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix.length==0||matrix==null) return null;
        int  rows= matrix.length;//行
        int columns = matrix[0].length;//列
        int start = 0;
        while (columns>start*2&&rows>start*2){
            printMatrixInCycle(matrix,columns,rows,start);
            start++;
        }
        return arrayList;
    }

    private void printMatrixInCycle(int[][] matrix, int columns, int rows, int start) {
/*        for(int i=start;i<columns-start;i++) arrayList.add(matrix[start][i]);
        for(int j=start+1;j<rows-start;j++) arrayList.add(matrix[j][columns-start-1]);
        for (int m=columns-start-2;m>=start&&columns-start-1>start;m--) arrayList.add(matrix[start][m]);错了两处 控制行不能少于两行 否则没必要 rows-start-1 这一列进行打印
        for (int n=rows-start-2;n>=start+1&&rows-start-1>start;n--) arrayList.add(matrix[n][start]);错了一处 控制列不能少于3列 否则没必要*/
// 从左到右打印一行
for(int i = start; i < columns - start; i++)
arrayList.add(matrix[start][i]);
// 从上到下打印一列
for(int j = start + 1; j < rows - start; j++)
arrayList.add(matrix[j][columns - start - 1]);
// 从右到左打印一行
for(int m = columns - start - 2; m >= start && rows - start - 1 > start; m--)
arrayList.add(matrix[rows - start - 1][m]);
// 从下到上打印一列
for(int n = rows - start - 2; n >= start + 1 && columns - start - 1 > start; n--)
arrayList.add(matrix[n][start]);
    }
}
