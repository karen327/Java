package school.chap5;

// 将十六进制数转换成十进制数

import java.util.Scanner;

public class Hw5_3 {
    public static void main(String[] args) {
        System.out.println("Please input a hex number: ");
        Scanner sc = new Scanner(System.in);
        String hexNum = sc.next();
        NumberConversion numberConversion = new NumberConversion();
        int decNum = numberConversion.hexToDecimal(hexNum);
        System.out.println(hexNum + "用十进制表示为" + decNum);
    }
}

class NumberConversion{
    int singleHexToDecimal(char c){
        int decNum = -1;
        if(c >= 48 && c <= 57){
            decNum = c - 48;
        } else if(c >= 65 && c <= 90){
            decNum = c - 55;
        } else if(c >= 97 && c <= 122){
            decNum = c - 87;
        } else {
            System.out.println("Invalid number!");
        }
        return decNum;
    }
    public int hexToDecimal(String hexNum){
        int decNum = 0;
        int len = hexNum.length();
        for(int i = 0; i < len; i ++){
            int n = singleHexToDecimal(hexNum.charAt(i));
            decNum *= 16;
            decNum += n;
        }
        return decNum;
    }
}
