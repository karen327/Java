package school.chap6;

import java.util.Scanner;

public class Hw6_3 {
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
                boolean flag = true;  // 一开始假设是质数，记为True
                // 对2到sqrt(i)之内的质数进行检查，发现不是质数就做标记并且不再接着检查下面的数break
                System.out.print(i);
                //System.out.print(res.substring(0, res.length() - 1) + "]");
                System.out.println((int)(Math.sqrt(i)));
                for(int j = 2; j < (int)(Math.sqrt(i)) + 1; j ++){
                    if (i % j == 0) {   // if i//i ==i/j:
                        flag = false;   // 发现不是质数，记为false
                        break;  //并且不再执行这轮循环
                    }
                }
                if(flag){   // 如果还是质数则添加到列表res
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
