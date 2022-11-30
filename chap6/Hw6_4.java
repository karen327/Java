package school.chap6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw6_4 {
    public static void main(String[] args) {
        int n1, n2;
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        n1 = Integer.parseInt(sc.next());
        n2 = n1;

//        while(n1 > 2){
//            int res1 = minPrime(n1);
//        }

    }

    public static int minPrime(int n){
        int[] res = null;
        if(n <= 2){
            System.out.println("not a prime");
            return -1;
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

                }
            }
        }
        return 0;
    }
}
