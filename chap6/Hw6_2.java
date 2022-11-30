package school.chap6;

import java.util.Scanner;

public class Hw6_2 {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        String res = "[";
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int cnt = 0;
        // 考虑2以下的数
        if(n <= 2){
            System.out.println("not a prime");
            return;
        // 如果该数大于2
        } else {
            // 按升序依次检查每个数
            for(int i = 2; i < n + 1; i ++){
                boolean flag = true;
                System.out.println((int)(Math.sqrt(i)));
                for(int j = 2; j < (int)(Math.sqrt(i)) + 1; j ++){
                    if (i % j == 0) {
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
            res = res.substring(0, res.length() - 1);
            res += "]";
        }
        System.out.println(n + "之内有" + cnt + "个质数");
        System.out.println(res);
    }
}
