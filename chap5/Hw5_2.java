package school.chap5;

// 先输入一个字符ch，再输入一个字符串，在字符串中查找该字符(ch)，
// 如果找到，则输出该字符在字符串中最后出现的位置，否则输出“Not Found”。

import java.util.Scanner;

public class Hw5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringManagement2 stringManagement2 = new StringManagement2();
        System.out.println("Please input a character: ");
        char c = sc.next().charAt(0);
        System.out.println("Please input a string: ");
        String s = sc.next();
        stringManagement2.searchChar(s, c);
    }
}

class StringManagement2{
    void searchChar(String s, char c){
        int len = s.length();
        int index = 0;
        boolean flag = false;
        for(int i = 0; i < len; i ++){
            if(s.charAt(i) == c){
                index = i;
                flag = true;
            }
        }
        if(flag){
            System.out.println(c + " is at No." + (index+1));
        } else {
            System.out.println("Not Found");
        }
    }
}
