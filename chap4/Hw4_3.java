package school.chap4;

//数学中的矩阵在Java中用二维数组实现，本例中要进行矩阵的加、乘运算。
// int c[][]={{1,2,3},{4,5,6},{7,8,9}};
// int d[][]={{2,2,2},{1,1,1},{3,3,3}};
//求c+d，c*d  ?

public class Hw4_3 {
    public static void main(String[] args) {
        int c[][]={{1,2,3},{4,5,6},{7,8,9}};
        int d[][]={{2,2,2},{1,1,1},{3,3,3}};
        MatrixManagement matrixManagement = new MatrixManagement();
        int[][] addMatrix = matrixManagement.add(c, d);
        int[][] multiMatrix = matrixManagement.multiple(c, d);
        matrixManagement.print(addMatrix);
        System.out.println();
        matrixManagement.print(multiMatrix);
    }
}

class MatrixManagement{
    public void print(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j ++){
                if(j == cols-1)
                    System.out.println(matrix[i][j]);
                else
                    System.out.printf("%d\t", matrix[i][j]);
            }
        }
    }

    public int[][] add(int[][] m1, int[][] m2){
        int row1 = m1.length;
        int col1 = m1[0].length;
        int row2 = m2.length;
        int col2 = m2[0].length;
        if(row1 != row2 || col1 != col2){
            return null;
        }
        int[][] res = new int[row1][col1];
        for(int i = 0; i < row1; i ++){
            for(int j = 0; j < col1; j ++){
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;
    }
    public int[][] multiple(int[][] m1, int[][] m2){
        int row1 = m1.length;
        int col1 = m1[0].length;
        int row2 = m2.length;
        int col2 = m2[0].length;
        if(col1 != row2){
            return null;
        }
        int[][] res = new int[row1][col2];
        for(int i = 0; i < col1; i ++){
            for(int j = 0; j < row1; j ++){
                for(int k = 0; k < col1; k ++){
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }
}
