package school.chap6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 质因数分解
public class Hw6_4 {
    public static void main(String[] args) {
        int n1, n2;
        List<Integer> resx = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n1 = Integer.parseInt(sc.next());
        n2 = n1;

        while(n1 > 2){
            List<Integer> res1 = minPrime(n1);
            for(int i : res1) {
                if(n1 % i == 0) {
                    resx.add(i);
                    n1 /= i;
                    break;
                }
            }
        }
        System.out.print(n2 + "=");
        int len = resx.size();
        for(int i = 0; i < len - 1; i ++) {
            System.out.print(resx.get(i) + "*");
        }
        System.out.print(resx.get(len - 1));

    }

    public static List<Integer> minPrime(int n){
        List<Integer> res = new ArrayList<>();
        if(n <= 2){
            System.out.println("not a prime");
            return null;
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
                    res.add(i);
                }
            }
        }
        return res;
    }
}
