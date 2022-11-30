package school.chap3;

import java.util.Scanner;

// 使用switch把小写类型的char型转为大写（只转换a/b/c/d/e）
public class Hw3_1 {
    public static void main(String[] args) {
        String res = "";
        System.out.println("Please input a lowercase letter: ");
        Scanner scanner = new Scanner(System.in);
        letterTransform lt = new letterTransform();
        res = lt.toUpperCase(scanner.next());
        System.out.println(res);
    }
}

class letterTransform {
    public String toUpperCase(String s){
        String res = "";
        switch(s){
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
                res = (char)(s.charAt(0) - 32) + "";
                break;
            default:
                res = "other";
                break;
        }
        return res;
    }
}
