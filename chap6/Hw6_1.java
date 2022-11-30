package school.chap6;

import java.util.Scanner;

public class Hw6_1 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        String res = "[";
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        if(n <= 2){
            System.out.println("not a prime");
            return;
        } else {
            for(int i = 2; i < n + 1; i ++){
                boolean flag = true;
                for(int j = 2; j < i; j ++){
                    if(i % j == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    res += String.valueOf(i);
                    res += ",";
                    cnt ++;
                }
            }
            int len = res.length();
            res = res.substring(0, len-1);
            res += "]";
        }
        System.out.println(n + "之内有" + cnt + "个质数");
        System.out.println(res);
    }
}
