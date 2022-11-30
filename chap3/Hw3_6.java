package school.chap3;

// 打印1-100之间所有是7的倍数的整数的个数及总和

public class Hw3_6 {
    public static void main(String[] args) {
        Calculator2 calculator2 = new Calculator2();
        calculator2.print7MultipleInfo(1, 100);
    }
}

class Calculator2{
    void print7MultipleInfo(int min, int max){
        int cnt = 0;
        int sum = 0;
        for(int i = min; i <= max; i ++){
            if(i % 7 == 0){
                cnt ++;
                sum += i;
            }
        }
        System.out.println("cnt = " + cnt);
        System.out.println("sum = " + sum);
    }
}
