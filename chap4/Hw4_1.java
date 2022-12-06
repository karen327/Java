package school.chap4;

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//产生10个2位正整数，按从小到大排序，输入任一正整数，插入到原有数据序列中，保持从小到大次序不变

public class Hw4_1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int newNum;
        Random random = new Random();
        Random r = new Random();
        for(int i = 0; i < 10; i ++){
            nums[i] = 10 + r.nextInt(90);
        }

        Arrays.sort(nums);
        ArrayManagement arrayManagement = new ArrayManagement();
        System.out.print("before：");
        arrayManagement.print(nums);

        System.out.println("Please input a positive integer: ");
        Scanner sc = new Scanner(System.in);
        newNum = Integer.parseInt(sc.next());
        int[] newNums = arrayManagement.insertByOrder(nums, newNum);
        System.out.print("after： ");
        arrayManagement.print(newNums);
    }
}

class ArrayManagement{
    public int[] insertByOrder(int[] arr, int n){
        int len = arr.length;
        int[] newArr = new int[len+1];
        int cnt = 0;
        for(int i = 0; i < len; i ++){
            if(n > arr[i]){
                newArr[cnt++] = arr[i];
            } else {
                break;
            }
        }
        newArr[cnt++] = n;
        for(int i = cnt - 1; i < len; i ++) {
            newArr[cnt++] = arr[i];
        }
        arr = newArr;
        return newArr;
    }

    public void print(int[] arr) {
        for(int n: arr) {
            System.out.printf("%d\t", n);
        }
        System.out.println();
    }
}
