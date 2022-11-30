package school.chap3;

// 输出所有的水仙花数

public class Hw3_7 {
    public static void main(String[] args) {
        NarcissisticNumber narNum = new NarcissisticNumber();
        narNum.printAllNarcissisticNumber();
    }
}

class NarcissisticNumber{
    public int getCube(int num){
        return num * num * num;
    }

    public boolean narcissistic(int num){
        if(num < 100 || num > 999){
            return false;
        }
        int sum = 0;
        int tmp = num;
        while(tmp != 0){
            sum += getCube(tmp % 10);
            tmp /= 10;
        }
        if(sum == num){
            return true;
        } else {
            return false;
        }
    }

    public void printAllNarcissisticNumber(){
        for(int i = 100; i < 1000; i ++){
            if(narcissistic(i)){
                System.out.printf("%d\t", i);
            }
        }
    }
}
