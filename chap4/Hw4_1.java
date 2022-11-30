package school.chap4;

import java.util.Arrays;
import java.util.Scanner;

//产生10个2位正整数，按从小到大排序，输入任一正整数，插入到原有数据序列中，保持从小到大次序不变

public class Hw4_1 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int newNum;
        Scanner sc = new Scanner(System.in);

        for(int n: nums){
            n = (int)(10 + Math.random() * 90);
        }
        Arrays.sort(nums);
        ArrayManagement arrayManagement = new ArrayManagement();
        newNum = Integer.parseInt(sc.next());
        arrayManagement.insertByOrder(nums, newNum);
    }
}

class ArrayManagement{
    public void insertByOrder(int[] arr, int n){
        int len = arr.length;
        int[] newArr = new int[len+1];
        for(int i = 0; i < len; i ++){
            if(n < arr[i]){
            }
        }
        arr = newArr;
    }
}
