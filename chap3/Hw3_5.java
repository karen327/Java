package school.chap3;

// 打印1-100之间所有奇数的和

public class Hw3_5 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.getOddSum(1, 100);
        System.out.println("Sum = " + sum);
    }
}

class Calculator{
    int getOddSum(int min, int max){
        int oddSum = 0;
        if(min % 2 == 0){
            min ++;
        }
        for(int i = min; i <= max; i += 2){
            oddSum += i;
        }
        return oddSum;
    }
}
