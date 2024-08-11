import java.util.* ;
import java.io.*; 
public class Symmetric_Matrix {
    public static boolean isMatrixSymmetric(int[][] matrix) {
        // Write your code here.
        boolean flag= false;
        int i,j,row,col;
        row=matrix.length;
        col=matrix[0].length;
        if(row!=col)
            return false;
        
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                if(matrix[i][j]!=matrix[j][i])
                {
                    return false;
                }
            }
        }
        return flag;
    }
}
