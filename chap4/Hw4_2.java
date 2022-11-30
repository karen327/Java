package school.chap4;

//输出杨辉三角型(输出10行)
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1
//        1 6 15 20 15 6 1
//        1 7 21 35 35 21 7 1
//        1 8 28 56 70 56 28 8 1
//        1 9 36 84 126 126 84 36 9 1


public class Hw4_2 {
    public static void main(String[] args) {
        YangHuiTriangle yangHuiTriangle = new YangHuiTriangle();
        yangHuiTriangle.printAllRows(10);
    }
}

class YangHuiTriangle{
    public int getNum(int rows, int cols){
        if(cols == 0 || cols == rows){
            return 1;
        }
        return getNum(rows-1, cols) + getNum(rows-1, cols-1);
    }

    public void printSingleRow(int rows){
        for(int i = 0; i <= rows; i ++){
            if(i == rows){
                System.out.println(getNum(rows, i));
            } else {
                System.out.printf("%d\t", getNum(rows, i));
            }
        }
    }

    public void printAllRows(int rows){
        for(int i = 0; i < rows; i ++){
            printSingleRow(i);
        }
    }
}
