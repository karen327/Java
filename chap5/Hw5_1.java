package school.chap5;

// 输入一个字符串，判断是否回文

import java.util.Scanner;

public class Hw5_1 {
    public static void main(String[] args) {
        System.out.println("Please input a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringJudgment stringJudgment = new StringJudgment();
        System.out.println(stringJudgment.isPalindrome(s));
    }
}

class StringJudgment{
    boolean isPalindrome(String s){
        int len = s.length();
        if(len <= 1){
            return true;
        }
        for(int i = 0; i <= len / 2; i ++){
            if(s.charAt(i) != s.charAt(len - i - 1)){
                return false;
            }
        }
        return true;
    }
}
